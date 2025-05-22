package com.google.android.gms.ads.nonagon.util.logging.csi;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class a {
    public final Context a;
    public final String b;
    public final String c;

    public a(Context context, VersionInfoParcel versionInfoParcel) {
        this.a = context;
        this.b = context.getPackageName();
        this.c = versionInfoParcel.a;
    }
}
