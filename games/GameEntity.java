package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bjnr;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class GameEntity extends GamesDowngradeableSafeParcel implements Game {
    public static final Parcelable.Creator CREATOR = new bjnr();
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
        return atyq.b(game.f(), this.a) && atyq.b(game.i(), this.b) && atyq.b(game.k(), this.c) && atyq.b(game.m(), this.d) && atyq.b(game.g(), this.e) && atyq.b(game.h(), this.f) && atyq.b(game.e(), this.g) && atyq.b(game.d(), this.h) && atyq.b(game.c(), this.i) && atyq.b(Boolean.valueOf(game.t()), Boolean.valueOf(this.j)) && atyq.b(Boolean.valueOf(game.r()), Boolean.valueOf(this.k)) && atyq.b(game.j(), this.l) && atyq.b(Integer.valueOf(game.a()), Integer.valueOf(this.n)) && atyq.b(Integer.valueOf(game.b()), Integer.valueOf(this.o)) && atyq.b(Boolean.valueOf(game.v()), Boolean.valueOf(this.p)) && atyq.b(Boolean.valueOf(game.w()), Boolean.valueOf(this.q)) && atyq.b(Boolean.valueOf(game.s()), Boolean.valueOf(this.u)) && atyq.b(Boolean.valueOf(game.q()), Boolean.valueOf(this.v)) && atyq.b(Boolean.valueOf(game.o()), Boolean.valueOf(this.w)) && atyq.b(game.n(), this.x) && atyq.b(Boolean.valueOf(game.p()), Boolean.valueOf(this.y)) && atyq.b(Boolean.valueOf(game.u()), Boolean.valueOf(this.z));
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
        atyp.b("ApplicationId", this.a, arrayList);
        atyp.b("DisplayName", this.b, arrayList);
        atyp.b("PrimaryCategory", this.c, arrayList);
        atyp.b("SecondaryCategory", this.d, arrayList);
        atyp.b("Description", this.e, arrayList);
        atyp.b("DeveloperName", this.f, arrayList);
        atyp.b("IconImageUri", this.g, arrayList);
        atyp.b("IconImageUrl", this.r, arrayList);
        atyp.b("HiResImageUri", this.h, arrayList);
        atyp.b("HiResImageUrl", this.s, arrayList);
        atyp.b("FeaturedImageUri", this.i, arrayList);
        atyp.b("FeaturedImageUrl", this.t, arrayList);
        atyp.b("PlayEnabledGame", Boolean.valueOf(this.j), arrayList);
        atyp.b("InstanceInstalled", Boolean.valueOf(this.k), arrayList);
        atyp.b("InstancePackageName", this.l, arrayList);
        atyp.b("AchievementTotalCount", Integer.valueOf(this.n), arrayList);
        atyp.b("LeaderboardCount", Integer.valueOf(this.o), arrayList);
        atyp.b("AreSnapshotsEnabled", Boolean.valueOf(this.w), arrayList);
        atyp.b("ThemeColor", this.x, arrayList);
        atyp.b("HasGamepadSupport", Boolean.valueOf(this.y), arrayList);
        return atyp.a(arrayList, this);
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
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.v(parcel, 5, this.e, false);
        atzr.v(parcel, 6, this.f, false);
        atzr.t(parcel, 7, this.g, i, false);
        atzr.t(parcel, 8, this.h, i, false);
        atzr.t(parcel, 9, this.i, i, false);
        atzr.e(parcel, 10, this.j);
        atzr.e(parcel, 11, this.k);
        atzr.v(parcel, 12, this.l, false);
        atzr.o(parcel, 13, this.m);
        atzr.o(parcel, 14, this.n);
        atzr.o(parcel, 15, this.o);
        atzr.e(parcel, 16, this.p);
        atzr.e(parcel, 17, this.q);
        atzr.v(parcel, 18, this.r, false);
        atzr.v(parcel, 19, this.s, false);
        atzr.v(parcel, 20, this.t, false);
        atzr.e(parcel, 21, this.u);
        atzr.e(parcel, 22, this.v);
        atzr.e(parcel, 23, this.w);
        atzr.v(parcel, 24, this.x, false);
        atzr.e(parcel, 25, this.y);
        atzr.e(parcel, 28, this.z);
        atzr.c(parcel, a);
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

    @Override // defpackage.atqs
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
