/**
* Created by Fredia Huya-Kouadio.
*/

#ifndef GODOT_ARCORE_H
#define GODOT_ARCORE_H

#include <gdnative_api_struct.gen.h>

extern "C" const godot_gdnative_ext_android_1_2_api_struct *android_1_2_api;

#ifdef __cplusplus
extern "C" {
#endif

void GDN_EXPORT godot_arcore_gdnative_init(godot_gdnative_init_options *options);
void GDN_EXPORT godot_arcore_gdnative_singleton();
void GDN_EXPORT godot_arcore_nativescript_init(void *handle);
void GDN_EXPORT godot_arcore_nativescript_terminate(void *handle);
void GDN_EXPORT godot_arcore_gdnative_terminate(godot_gdnative_terminate_options *options);

#ifdef __cplusplus
};
#endif

extern const godot_arvr_interface_gdnative arvr_interface_struct;

#endif // GODOT_ARCORE_H
