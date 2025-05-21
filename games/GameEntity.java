package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bhjc;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class GameEntity extends GamesDowngradeableSafeParcel implements Game {
    public static final Parcelable.Creator CREATOR = new bhjc();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final Uri g;
    public final Uri h;
    public final Uri i;
    public final boolean j;
    public final boolean k;
    public final String l;
    public final int m;
    public final int n;
    public final int o;
    public final boolean p;
    public final boolean q;
    public final String r;
    public final String s;
    public final String t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final String x;
    public final boolean y;
    public final boolean z;

    public GameEntity(Game game) {
        GameEntity gameEntity = (GameEntity) game;
        this.a = gameEntity.a;
        this.c = gameEntity.c;
        this.d = gameEntity.d;
        this.e = gameEntity.e;
        this.f = gameEntity.f;
        this.b = gameEntity.b;
        this.g = gameEntity.g;
        this.r = gameEntity.r;
        this.h = gameEntity.h;
        this.s = gameEntity.s;
        this.i = gameEntity.i;
        this.t = gameEntity.t;
        this.j = gameEntity.j;
        this.k = gameEntity.k;
        this.l = gameEntity.l;
        this.m = 1;
        this.n = gameEntity.n;
        this.o = gameEntity.o;
        this.p = gameEntity.p;
        this.q = gameEntity.q;
        this.u = gameEntity.u;
        this.v = gameEntity.v;
        this.w = gameEntity.w;
        this.x = gameEntity.x;
        this.y = gameEntity.y;
        this.z = gameEntity.z;
    }

    @Override // com.google.android.gms.games.Game
    public final int a() {
        return this.n;
    }

    @Override // com.google.android.gms.games.Game
    public final int b() {
        return this.o;
    }

    @Override // com.google.android.gms.games.Game
    public final Uri c() {
        return this.i;
    }

    @Override // com.google.android.gms.games.Game
    public final Uri d() {
        return this.h;
    }

    @Override // com.google.android.gms.games.Game
    public final Uri e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Game)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Game game = (Game) obj;
        return arwb.b(game.f(), this.a) && arwb.b(game.i(), this.b) && arwb.b(game.k(), this.c) && arwb.b(game.m(), this.d) && arwb.b(game.g(), this.e) && arwb.b(game.h(), this.f) && arwb.b(game.e(), this.g) && arwb.b(game.d(), this.h) && arwb.b(game.c(), this.i) && arwb.b(Boolean.valueOf(game.t()), Boolean.valueOf(this.j)) && arwb.b(Boolean.valueOf(game.r()), Boolean.valueOf(this.k)) && arwb.b(game.j(), this.l) && arwb.b(Integer.valueOf(game.a()), Integer.valueOf(this.n)) && arwb.b(Integer.valueOf(game.b()), Integer.valueOf(this.o)) && arwb.b(Boolean.valueOf(game.v()), Boolean.valueOf(this.p)) && arwb.b(Boolean.valueOf(game.w()), Boolean.valueOf(this.q)) && arwb.b(Boolean.valueOf(game.s()), Boolean.valueOf(this.u)) && arwb.b(Boolean.valueOf(game.q()), Boolean.valueOf(this.v)) && arwb.b(Boolean.valueOf(game.o()), Boolean.valueOf(this.w)) && arwb.b(game.n(), this.x) && arwb.b(Boolean.valueOf(game.p()), Boolean.valueOf(this.y)) && arwb.b(Boolean.valueOf(game.u()), Boolean.valueOf(this.z));
    }

    @Override // com.google.android.gms.games.Game
    public final String f() {
        return this.a;
    }

    @Override // com.google.android.gms.games.Game
    public final String g() {
        return this.e;
    }

    @Override // com.google.android.gms.games.Game
    public final String h() {
        return this.f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, Boolean.valueOf(this.j), Boolean.valueOf(this.k), this.l, Integer.valueOf(this.n), Integer.valueOf(this.o), Boolean.valueOf(this.p), Boolean.valueOf(this.q), Boolean.valueOf(this.u), Boolean.valueOf(this.v), Boolean.valueOf(this.w), this.x, Boolean.valueOf(this.y), Boolean.valueOf(this.z)});
    }

    @Override // com.google.android.gms.games.Game
    public final String i() {
        return this.b;
    }

    @Override // com.google.android.gms.games.Game
    public final String j() {
        return this.l;
    }

    @Override // com.google.android.gms.games.Game
    public final String k() {
        return this.c;
    }

    @Override // com.google.android.gms.games.Game
    public final String m() {
        return this.d;
    }

    @Override // com.google.android.gms.games.Game
    public final String n() {
        return this.x;
    }

    @Override // com.google.android.gms.games.Game
    public final boolean o() {
        return this.w;
    }

    @Override // com.google.android.gms.games.Game
    public final boolean p() {
        return this.y;
    }

    @Override // com.google.android.gms.games.Game
    public final boolean q() {
        return this.v;
    }

    @Override // com.google.android.gms.games.Game
    public final boolean r() {
        return this.k;
    }

    @Override // com.google.android.gms.games.Game
    public final boolean s() {
        return this.u;
    }

    @Override // com.google.android.gms.games.Game
    public final boolean t() {
        return this.j;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("ApplicationId", this.a, arrayList);
        arwa.b("DisplayName", this.b, arrayList);
        arwa.b("PrimaryCategory", this.c, arrayList);
        arwa.b("SecondaryCategory", this.d, arrayList);
        arwa.b("Description", this.e, arrayList);
        arwa.b("DeveloperName", this.f, arrayList);
        arwa.b("IconImageUri", this.g, arrayList);
        arwa.b("IconImageUrl", this.r, arrayList);
        arwa.b("HiResImageUri", this.h, arrayList);
        arwa.b("HiResImageUrl", this.s, arrayList);
        arwa.b("FeaturedImageUri", this.i, arrayList);
        arwa.b("FeaturedImageUrl", this.t, arrayList);
        arwa.b("PlayEnabledGame", Boolean.valueOf(this.j), arrayList);
        arwa.b("InstanceInstalled", Boolean.valueOf(this.k), arrayList);
        arwa.b("InstancePackageName", this.l, arrayList);
        arwa.b("AchievementTotalCount", Integer.valueOf(this.n), arrayList);
        arwa.b("LeaderboardCount", Integer.valueOf(this.o), arrayList);
        arwa.b("AreSnapshotsEnabled", Boolean.valueOf(this.w), arrayList);
        arwa.b("ThemeColor", this.x, arrayList);
        arwa.b("HasGamepadSupport", Boolean.valueOf(this.y), arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // com.google.android.gms.games.Game
    public final boolean u() {
        return this.z;
    }

    @Override // com.google.android.gms.games.Game
    public final boolean v() {
        return this.p;
    }

    @Override // com.google.android.gms.games.Game
    public final boolean w() {
        return this.q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.v(parcel, 5, this.e, false);
        arxc.v(parcel, 6, this.f, false);
        arxc.t(parcel, 7, this.g, i, false);
        arxc.t(parcel, 8, this.h, i, false);
        arxc.t(parcel, 9, this.i, i, false);
        arxc.e(parcel, 10, this.j);
        arxc.e(parcel, 11, this.k);
        arxc.v(parcel, 12, this.l, false);
        arxc.o(parcel, 13, this.m);
        arxc.o(parcel, 14, this.n);
        arxc.o(parcel, 15, this.o);
        arxc.e(parcel, 16, this.p);
        arxc.e(parcel, 17, this.q);
        arxc.v(parcel, 18, this.r, false);
        arxc.v(parcel, 19, this.s, false);
        arxc.v(parcel, 20, this.t, false);
        arxc.e(parcel, 21, this.u);
        arxc.e(parcel, 22, this.v);
        arxc.e(parcel, 23, this.w);
        arxc.v(parcel, 24, this.x, false);
        arxc.e(parcel, 25, this.y);
        arxc.e(parcel, 28, this.z);
        arxc.c(parcel, a);
    }

    public GameEntity(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Uri uri2, Uri uri3, boolean z, boolean z2, String str7, int i, int i2, int i3, boolean z3, boolean z4, String str8, String str9, String str10, boolean z5, boolean z6, boolean z7, String str11, boolean z8, boolean z9) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = uri;
        this.r = str8;
        this.h = uri2;
        this.s = str9;
        this.i = uri3;
        this.t = str10;
        this.j = z;
        this.k = z2;
        this.l = str7;
        this.m = i;
        this.n = i2;
        this.o = i3;
        this.p = z3;
        this.q = z4;
        this.u = z5;
        this.v = z6;
        this.w = z7;
        this.x = str11;
        this.y = z8;
        this.z = z9;
    }

    @Override // defpackage.arod
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
