package com.google.android.gms.games.achievement;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import defpackage.atvs;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bjpo;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class AchievementEntity extends GamesAbstractSafeParcelable implements Achievement {
    public static final Parcelable.Creator CREATOR = new bjpo();
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
        atvs.e(this.b == 1);
        return this.m;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final int c() {
        return this.l;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final int d() {
        atvs.e(this.b == 1);
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
        return (i != 1 || (achievement.b() == b() && achievement.d() == d())) && achievement.g() == this.p && achievement.c() == this.l && achievement.f() == this.o && atyq.b(achievement.i(), this.a) && atyq.b(achievement.j(), this.r) && atyq.b(achievement.m(), this.c) && atyq.b(achievement.k(), this.d) && atyq.b(achievement.h(), this.k) && achievement.a() == this.q;
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
        atyp.b("Id", this.a, arrayList);
        atyp.b("Game Id", this.r, arrayList);
        int i = this.b;
        atyp.b("Type", Integer.valueOf(i), arrayList);
        atyp.b("Name", this.c, arrayList);
        atyp.b("Description", this.d, arrayList);
        atyp.b("Player", this.k, arrayList);
        atyp.b("State", Integer.valueOf(this.l), arrayList);
        atyp.b("Rarity Percent", Float.valueOf(this.q), arrayList);
        if (i == 1) {
            atyp.b("CurrentSteps", Integer.valueOf(b()), arrayList);
            atyp.b("TotalSteps", Integer.valueOf(d()), arrayList);
        }
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.o(parcel, 2, this.b);
        atzr.v(parcel, 3, this.c, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.t(parcel, 5, this.e, i, false);
        atzr.v(parcel, 6, this.f, false);
        atzr.t(parcel, 7, this.g, i, false);
        atzr.v(parcel, 8, this.h, false);
        atzr.o(parcel, 9, this.i);
        atzr.v(parcel, 10, this.j, false);
        atzr.t(parcel, 11, this.k, i, false);
        atzr.o(parcel, 12, this.l);
        atzr.o(parcel, 13, this.m);
        atzr.v(parcel, 14, this.n, false);
        atzr.q(parcel, 15, this.o);
        atzr.q(parcel, 16, this.p);
        atzr.l(parcel, 17, this.q);
        atzr.v(parcel, 18, this.r, false);
        atzr.c(parcel, a);
    }

    @Override // defpackage.atqs
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
