package com.google.android.gms.ads.internal.request;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class l {
    public final Object a;
    public final Context b;
    public SharedPreferences c;
    public final VersionInfoParcel d;
    public final com.google.android.gms.ads.internal.js.function.o e;

    public l() {
        throw null;
    }

    public static JSONObject a(Context context, VersionInfoParcel versionInfoParcel) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (((Boolean) com.google.android.gms.ads.internal.flag.n.b.d()).booleanValue()) {
                jSONObject.put("package_name", context.getPackageName());
            }
            jSONObject.put("js", versionInfoParcel.a);
            jSONObject.put("mf", com.google.android.gms.ads.internal.flag.n.c.d());
            jSONObject.put("cl", "758020094");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", com.google.android.gms.ads.internal.util.client.l.a(context));
            jSONObject.put("container_version", 251864004);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public l(Context context, com.google.android.gms.ads.internal.js.function.o oVar, VersionInfoParcel versionInfoParcel) {
        this.a = new Object();
        this.b = context.getApplicationContext();
        this.d = versionInfoParcel;
        this.e = oVar;
    }
}
