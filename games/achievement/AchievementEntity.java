package com.google.android.gms.games.achievement;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import defpackage.artd;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bhkz;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class AchievementEntity extends GamesAbstractSafeParcelable implements Achievement {
    public static final Parcelable.Creator CREATOR = new bhkz();
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final Uri e;
    public final String f;
    public final Uri g;
    public final String h;
    public final int i;
    public final String j;
    public final PlayerEntity k;
    public final int l;
    public final int m;
    public final String n;
    public final long o;
    public final long p;
    public final float q;
    public final String r;

    public AchievementEntity(String str, int i, String str2, String str3, Uri uri, String str4, Uri uri2, String str5, int i2, String str6, PlayerEntity playerEntity, int i3, int i4, String str7, long j, long j2, float f, String str8) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = uri;
        this.f = str4;
        this.g = uri2;
        this.h = str5;
        this.i = i2;
        this.j = str6;
        this.k = playerEntity;
        this.l = i3;
        this.m = i4;
        this.n = str7;
        this.o = j;
        this.p = j2;
        this.q = f;
        this.r = str8;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final float a() {
        return this.q;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final int b() {
        artd.e(this.b == 1);
        return this.m;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final int c() {
        return this.l;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final int d() {
        artd.e(this.b == 1);
        return this.i;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final int e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Achievement)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Achievement achievement = (Achievement) obj;
        int e = achievement.e();
        int i = this.b;
        if (e != i) {
            return false;
        }
        return (i != 1 || (achievement.b() == b() && achievement.d() == d())) && achievement.g() == this.p && achievement.c() == this.l && achievement.f() == this.o && arwb.b(achievement.i(), this.a) && arwb.b(achievement.j(), this.r) && arwb.b(achievement.m(), this.c) && arwb.b(achievement.k(), this.d) && arwb.b(achievement.h(), this.k) && achievement.a() == this.q;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final long f() {
        return this.o;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final long g() {
        return this.p;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final Player h() {
        return this.k;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = this.b;
        if (i3 == 1) {
            int b = b();
            i2 = d();
            i = b;
            i3 = 1;
        } else {
            i = 0;
            i2 = 0;
        }
        return Arrays.hashCode(new Object[]{this.a, this.r, this.c, Integer.valueOf(i3), this.d, Long.valueOf(this.p), Integer.valueOf(this.l), Long.valueOf(this.o), this.k, Integer.valueOf(i), Integer.valueOf(i2)});
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final String i() {
        return this.a;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final String j() {
        return this.r;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final String k() {
        return this.d;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final String m() {
        return this.c;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("Id", this.a, arrayList);
        arwa.b("Game Id", this.r, arrayList);
        int i = this.b;
        arwa.b("Type", Integer.valueOf(i), arrayList);
        arwa.b("Name", this.c, arrayList);
        arwa.b("Description", this.d, arrayList);
        arwa.b("Player", this.k, arrayList);
        arwa.b("State", Integer.valueOf(this.l), arrayList);
        arwa.b("Rarity Percent", Float.valueOf(this.q), arrayList);
        if (i == 1) {
            arwa.b("CurrentSteps", Integer.valueOf(b()), arrayList);
            arwa.b("TotalSteps", Integer.valueOf(d()), arrayList);
        }
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.o(parcel, 2, this.b);
        arxc.v(parcel, 3, this.c, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.t(parcel, 5, this.e, i, false);
        arxc.v(parcel, 6, this.f, false);
        arxc.t(parcel, 7, this.g, i, false);
        arxc.v(parcel, 8, this.h, false);
        arxc.o(parcel, 9, this.i);
        arxc.v(parcel, 10, this.j, false);
        arxc.t(parcel, 11, this.k, i, false);
        arxc.o(parcel, 12, this.l);
        arxc.o(parcel, 13, this.m);
        arxc.v(parcel, 14, this.n, false);
        arxc.q(parcel, 15, this.o);
        arxc.q(parcel, 16, this.p);
        arxc.l(parcel, 17, this.q);
        arxc.v(parcel, 18, this.r, false);
        arxc.c(parcel, a);
    }

    @Override // defpackage.arod
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
