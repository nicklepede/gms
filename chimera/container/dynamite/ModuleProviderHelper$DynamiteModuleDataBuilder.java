package com.google.android.gms.chimera.container.dynamite;

import com.google.android.gms.dynamite.DynamiteModuleData;
import com.google.android.gms.dynamite.RequestStats;
import com.google.android.gms.dynamiteloader.DynamiteFlags;
import defpackage.arxd;
import defpackage.azjf;
import defpackage.pov;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class ModuleProviderHelper$DynamiteModuleDataBuilder extends DynamiteModuleData {
    private static final byte[] h = new byte[0];
    public long a;
    public String b;
    public int c;
    public boolean d;
    public int e;
    public long f;
    public final azjf g;

    public ModuleProviderHelper$DynamiteModuleDataBuilder() {
        super(0L, null, 0, false, -1, -1L, null, h);
        this.g = new azjf();
    }

    @Override // com.google.android.gms.dynamite.DynamiteModuleData
    public final int a() {
        return this.c;
    }

    @Override // com.google.android.gms.dynamite.DynamiteModuleData
    public final int b() {
        return this.e;
    }

    @Override // com.google.android.gms.dynamite.DynamiteModuleData
    public final long c() {
        return this.f;
    }

    @Override // com.google.android.gms.dynamite.DynamiteModuleData
    public final long d() {
        return this.a;
    }

    @Override // com.google.android.gms.dynamite.DynamiteModuleData
    public final RequestStats e() {
        return this.g.a();
    }

    @Override // com.google.android.gms.dynamite.DynamiteModuleData
    public final String f() {
        return this.b;
    }

    @Override // com.google.android.gms.dynamite.DynamiteModuleData
    public final boolean g() {
        return this.d;
    }

    @Override // com.google.android.gms.dynamite.DynamiteModuleData
    public final byte[] h() {
        return arxd.n(DynamiteFlags.r(pov.b()));
    }
}
