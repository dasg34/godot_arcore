package org.godotengine.plugin.arcore;

import android.app.Activity;
import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;

import org.godotengine.godot.Godot;
import org.godotengine.godot.plugin.GodotPlugin;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class GodotARCorePlugin extends GodotPlugin {

	public GodotARCorePlugin(Godot godot) {
		super(godot);
	}

    static {
        System.loadLibrary("godot_arcore");
    }

    public native void godotARCoreInit();

    public void ARCoreInitialize() {
        godotARCoreInit();

    }

	@Override
	public View onMainCreate(Activity activity) {
        if (ARCoreUtil.shouldSetupARCore(activity, getGodot().getXRMode())) {
            ARCoreUtil.setupARCore(activity, activity.getIntent());
            return null;
        }
		return null;
	}

	@NonNull
	@Override
	public String getPluginName() {
		return "GodotARCore";
	}


    @NonNull
    @Override
    public List<String> getPluginMethods() {
        return new ArrayList<>(Collections.singletonList("ARCoreInitialize"));
    }

    @NotNull
    @Override
    protected Set<String> getPluginGDNativeLibrariesPaths() {
        return Collections.singleton("addons/godot_arcore/godot_arcore.gdnlib");
    }
}
