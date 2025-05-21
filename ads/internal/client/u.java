package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.Random;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class u {
    public static final u a = new u();
    public final String b;
    private final com.google.android.gms.ads.internal.util.client.f c;
    private final s d;
    private final VersionInfoParcel e;
    private final Random f;

    protected u() {
        com.google.android.gms.ads.internal.util.client.f fVar = new com.google.android.gms.ads.internal.util.client.f();
        s sVar = new s(new f(), new d());
        String b = com.google.android.gms.ads.internal.util.client.f.b();
        VersionInfoParcel versionInfoParcel = new VersionInfoParcel(0, ModuleDescriptor.MODULE_VERSION);
        Random random = new Random();
        this.c = fVar;
        this.d = sVar;
        this.b = b;
        this.e = versionInfoParcel;
        this.f = random;
    }

    public static s a() {
        return a.d;
    }

    public static com.google.android.gms.ads.internal.util.client.f b() {
        return a.c;
    }

    public static VersionInfoParcel c() {
        return a.e;
    }

    public static Random d() {
        return a.f;
    }
}
