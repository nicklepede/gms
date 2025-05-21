package com.google.android.gms.chimera.container.dynamite;

import com.google.android.gms.dynamite.DynamiteModuleData;
import com.google.android.gms.dynamiteloader.DynamiteFlags;
import defpackage.arxd;
import defpackage.pov;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class ModuleProviderHelperV1$DynamiteModuleDataBuilderV1 extends DynamiteModuleData {
    public static final byte[] a = new byte[0];
    public long b;
    public String c;
    public int d;
    public boolean e;
    public int f;
    public long g;

    public ModuleProviderHelperV1$DynamiteModuleDataBuilderV1() {
        super(0L, null, 0, false, -1, -1L, null, a);
    }

    @Override // com.google.android.gms.dynamite.DynamiteModuleData
    public final int a() {
        return this.d;
    }

    @Override // com.google.android.gms.dynamite.DynamiteModuleData
    public final int b() {
        return this.f;
    }

    @Override // com.google.android.gms.dynamite.DynamiteModuleData
    public final long c() {
        return this.g;
    }

    @Override // com.google.android.gms.dynamite.DynamiteModuleData
    public final long d() {
        return this.b;
    }

    @Override // com.google.android.gms.dynamite.DynamiteModuleData
    public final String f() {
        return this.c;
    }

    @Override // com.google.android.gms.dynamite.DynamiteModuleData
    public final boolean g() {
        return this.e;
    }

    @Override // com.google.android.gms.dynamite.DynamiteModuleData
    public final byte[] h() {
        return arxd.n(DynamiteFlags.r(pov.b()));
    }
}
