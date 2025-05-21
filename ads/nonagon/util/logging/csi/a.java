package com.google.android.gms.ads.nonagon.util.logging.csi;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
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
