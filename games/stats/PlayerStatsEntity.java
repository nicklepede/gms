package com.google.android.gms.games.stats;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bhse;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class PlayerStatsEntity extends GamesAbstractSafeParcelable implements PlayerStats {
    public static final Parcelable.Creator CREATOR = new bhse();
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
        return arwb.b(Float.valueOf(playerStats.a()), Float.valueOf(a())) && arwb.b(Float.valueOf(playerStats.b()), Float.valueOf(b())) && arwb.b(Integer.valueOf(playerStats.h()), Integer.valueOf(h())) && arwb.b(Integer.valueOf(playerStats.i()), Integer.valueOf(i())) && arwb.b(Integer.valueOf(playerStats.j()), Integer.valueOf(j())) && arwb.b(Float.valueOf(playerStats.d()), Float.valueOf(d())) && arwb.b(Float.valueOf(playerStats.e()), Float.valueOf(e())) && arwb.b(Float.valueOf(playerStats.f()), Float.valueOf(f())) && arwb.b(Float.valueOf(playerStats.c()), Float.valueOf(c())) && arwb.b(Float.valueOf(playerStats.g()), Float.valueOf(g()));
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
        arwa.b("AverageSessionLength", Float.valueOf(a()), arrayList);
        arwa.b("ChurnProbability", Float.valueOf(b()), arrayList);
        arwa.b("DaysSinceLastPlayed", Integer.valueOf(h()), arrayList);
        arwa.b("NumberOfPurchases", Integer.valueOf(i()), arrayList);
        arwa.b("NumberOfSessions", Integer.valueOf(j()), arrayList);
        arwa.b("SessionPercentile", Float.valueOf(d()), arrayList);
        arwa.b("SpendPercentile", Float.valueOf(e()), arrayList);
        arwa.b("SpendProbability", Float.valueOf(f()), arrayList);
        arwa.b("HighSpenderProbability", Float.valueOf(c()), arrayList);
        arwa.b("TotalSpendNext28Days", Float.valueOf(g()), arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        float f = this.a;
        int a = arxc.a(parcel);
        arxc.l(parcel, 1, f);
        arxc.l(parcel, 2, this.b);
        arxc.o(parcel, 3, this.c);
        arxc.o(parcel, 4, this.d);
        arxc.o(parcel, 5, this.e);
        arxc.l(parcel, 6, this.f);
        arxc.l(parcel, 7, this.g);
        arxc.g(parcel, 8, this.h, false);
        arxc.l(parcel, 9, this.i);
        arxc.l(parcel, 10, this.j);
        arxc.l(parcel, 11, this.k);
        arxc.c(parcel, a);
    }

    @Override // defpackage.arod
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
