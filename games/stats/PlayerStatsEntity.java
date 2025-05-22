package com.google.android.gms.games.stats;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bjwt;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class PlayerStatsEntity extends GamesAbstractSafeParcelable implements PlayerStats {
    public static final Parcelable.Creator CREATOR = new bjwt();
    public final float a;
    public final float b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;
    public final Bundle h;
    public final float i;
    public final float j;
    public final float k;

    public PlayerStatsEntity(float f, float f2, int i, int i2, int i3, float f3, float f4, Bundle bundle, float f5, float f6, float f7) {
        this.a = f;
        this.b = f2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = f3;
        this.g = f4;
        this.h = bundle;
        this.i = f5;
        this.j = f6;
        this.k = f7;
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final float a() {
        return this.a;
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final float b() {
        return this.b;
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final float c() {
        return this.j;
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final float d() {
        return this.f;
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final float e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PlayerStats)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        PlayerStats playerStats = (PlayerStats) obj;
        return atyq.b(Float.valueOf(playerStats.a()), Float.valueOf(a())) && atyq.b(Float.valueOf(playerStats.b()), Float.valueOf(b())) && atyq.b(Integer.valueOf(playerStats.h()), Integer.valueOf(h())) && atyq.b(Integer.valueOf(playerStats.i()), Integer.valueOf(i())) && atyq.b(Integer.valueOf(playerStats.j()), Integer.valueOf(j())) && atyq.b(Float.valueOf(playerStats.d()), Float.valueOf(d())) && atyq.b(Float.valueOf(playerStats.e()), Float.valueOf(e())) && atyq.b(Float.valueOf(playerStats.f()), Float.valueOf(f())) && atyq.b(Float.valueOf(playerStats.c()), Float.valueOf(c())) && atyq.b(Float.valueOf(playerStats.g()), Float.valueOf(g()));
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final float f() {
        return this.i;
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final float g() {
        return this.k;
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final int h() {
        return this.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(a()), Float.valueOf(b()), Integer.valueOf(h()), Integer.valueOf(i()), Integer.valueOf(j()), Float.valueOf(d()), Float.valueOf(e()), Float.valueOf(f()), Float.valueOf(c()), Float.valueOf(g())});
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final int i() {
        return this.d;
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final int j() {
        return this.e;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("AverageSessionLength", Float.valueOf(a()), arrayList);
        atyp.b("ChurnProbability", Float.valueOf(b()), arrayList);
        atyp.b("DaysSinceLastPlayed", Integer.valueOf(h()), arrayList);
        atyp.b("NumberOfPurchases", Integer.valueOf(i()), arrayList);
        atyp.b("NumberOfSessions", Integer.valueOf(j()), arrayList);
        atyp.b("SessionPercentile", Float.valueOf(d()), arrayList);
        atyp.b("SpendPercentile", Float.valueOf(e()), arrayList);
        atyp.b("SpendProbability", Float.valueOf(f()), arrayList);
        atyp.b("HighSpenderProbability", Float.valueOf(c()), arrayList);
        atyp.b("TotalSpendNext28Days", Float.valueOf(g()), arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        float f = this.a;
        int a = atzr.a(parcel);
        atzr.l(parcel, 1, f);
        atzr.l(parcel, 2, this.b);
        atzr.o(parcel, 3, this.c);
        atzr.o(parcel, 4, this.d);
        atzr.o(parcel, 5, this.e);
        atzr.l(parcel, 6, this.f);
        atzr.l(parcel, 7, this.g);
        atzr.g(parcel, 8, this.h, false);
        atzr.l(parcel, 9, this.i);
        atzr.l(parcel, 10, this.j);
        atzr.l(parcel, 11, this.k);
        atzr.c(parcel, a);
    }

    @Override // defpackage.atqs
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
