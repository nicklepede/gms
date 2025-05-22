package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.internal.player.MostRecentGameInfoEntity;
import defpackage.atvs;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bjof;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class PlayerEntity extends GamesDowngradeableSafeParcel implements Player {
    public static final Parcelable.Creator CREATOR = new bjof();
    public final String a;
    public final String b;
    public final Uri c;
    public final Uri d;
    public final long e;
    public final int f;
    public final long g;
    public final String h;
    public final String i;
    public final String j;
    public final MostRecentGameInfoEntity k;
    public final PlayerLevelInfo l;
    public final boolean m;
    public final boolean n;
    public final String o;
    public final String p;
    public final Uri q;
    public final String r;
    public final Uri s;
    public final String t;
    public final long u;
    public final PlayerRelationshipInfoEntity v;
    public final CurrentPlayerInfoEntity w;
    public final boolean x;
    public final String y;

    public PlayerEntity(String str, String str2, Uri uri, Uri uri2, long j, int i, long j2, String str3, String str4, String str5, MostRecentGameInfoEntity mostRecentGameInfoEntity, PlayerLevelInfo playerLevelInfo, boolean z, boolean z2, String str6, String str7, Uri uri3, String str8, Uri uri4, String str9, long j3, PlayerRelationshipInfoEntity playerRelationshipInfoEntity, CurrentPlayerInfoEntity currentPlayerInfoEntity, boolean z3, String str10) {
        this.a = str;
        this.b = str2;
        this.c = uri;
        this.h = str3;
        this.d = uri2;
        this.i = str4;
        this.e = j;
        this.f = i;
        this.g = j2;
        this.j = str5;
        this.m = z;
        this.k = mostRecentGameInfoEntity;
        this.l = playerLevelInfo;
        this.n = z2;
        this.o = str6;
        this.p = str7;
        this.q = uri3;
        this.r = str8;
        this.s = uri4;
        this.t = str9;
        this.u = j3;
        this.v = playerRelationshipInfoEntity;
        this.w = currentPlayerInfoEntity;
        this.x = z3;
        this.y = str10;
    }

    @Override // com.google.android.gms.games.Player
    public final long a() {
        return this.e;
    }

    @Override // com.google.android.gms.games.Player
    public final long b() {
        return this.u;
    }

    @Override // com.google.android.gms.games.Player
    public final Uri c() {
        return this.q;
    }

    @Override // com.google.android.gms.games.Player
    public final Uri d() {
        return this.s;
    }

    @Override // com.google.android.gms.games.Player
    public final Uri e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Player)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Player player = (Player) obj;
        return atyq.b(player.o(), this.a) && atyq.b(player.j(), this.b) && atyq.b(Boolean.valueOf(player.q()), Boolean.valueOf(this.n)) && atyq.b(player.f(), this.c) && atyq.b(player.e(), this.d) && atyq.b(Long.valueOf(player.a()), Long.valueOf(this.e)) && atyq.b(player.p(), this.j) && atyq.b(player.h(), this.l) && atyq.b(player.m(), this.o) && atyq.b(player.n(), this.p) && atyq.b(player.c(), this.q) && atyq.b(player.d(), this.s) && atyq.b(Long.valueOf(player.b()), Long.valueOf(this.u)) && atyq.b(player.g(), this.w) && atyq.b(player.i(), this.v) && atyq.b(Boolean.valueOf(player.r()), Boolean.valueOf(this.x)) && atyq.b(player.k(), this.y);
    }

    @Override // com.google.android.gms.games.Player
    public final Uri f() {
        return this.c;
    }

    @Override // com.google.android.gms.games.Player
    public final CurrentPlayerInfo g() {
        return this.w;
    }

    @Override // com.google.android.gms.games.Player
    public final PlayerLevelInfo h() {
        return this.l;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Boolean.valueOf(this.n), this.c, this.d, Long.valueOf(this.e), this.j, this.l, this.o, this.p, this.q, this.s, Long.valueOf(this.u), this.v, this.w, Boolean.valueOf(this.x), this.y});
    }

    @Override // com.google.android.gms.games.Player
    public final PlayerRelationshipInfo i() {
        return this.v;
    }

    @Override // com.google.android.gms.games.Player
    public final String j() {
        return this.b;
    }

    @Override // com.google.android.gms.games.Player
    public final String k() {
        return this.y;
    }

    @Override // com.google.android.gms.games.Player
    public final String m() {
        return this.o;
    }

    @Override // com.google.android.gms.games.Player
    public final String n() {
        return this.p;
    }

    @Override // com.google.android.gms.games.Player
    public final String o() {
        return this.a;
    }

    @Override // com.google.android.gms.games.Player
    public final String p() {
        return this.j;
    }

    @Override // com.google.android.gms.games.Player
    public final boolean q() {
        return this.n;
    }

    @Override // com.google.android.gms.games.Player
    public final boolean r() {
        return this.x;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("PlayerId", this.a, arrayList);
        atyp.b("DisplayName", this.b, arrayList);
        atyp.b("HasDebugAccess", Boolean.valueOf(this.n), arrayList);
        atyp.b("IconImageUri", this.c, arrayList);
        atyp.b("IconImageUrl", this.h, arrayList);
        atyp.b("HiResImageUri", this.d, arrayList);
        atyp.b("HiResImageUrl", this.i, arrayList);
        atyp.b("RetrievedTimestamp", Long.valueOf(this.e), arrayList);
        atyp.b("Title", this.j, arrayList);
        atyp.b("LevelInfo", this.l, arrayList);
        atyp.b("GamerTag", this.o, arrayList);
        atyp.b("Name", this.p, arrayList);
        atyp.b("BannerImageLandscapeUri", this.q, arrayList);
        atyp.b("BannerImageLandscapeUrl", this.r, arrayList);
        atyp.b("BannerImagePortraitUri", this.s, arrayList);
        atyp.b("BannerImagePortraitUrl", this.t, arrayList);
        atyp.b("CurrentPlayerInfo", this.w, arrayList);
        atyp.b("TotalUnlockedAchievement", Long.valueOf(this.u), arrayList);
        if (this.x) {
            atyp.b("AlwaysAutoSignIn", true, arrayList);
        }
        PlayerRelationshipInfoEntity playerRelationshipInfoEntity = this.v;
        if (playerRelationshipInfoEntity != null) {
            atyp.b("RelationshipInfo", playerRelationshipInfoEntity, arrayList);
        }
        String str = this.y;
        if (str != null) {
            atyp.b("GamePlayerId", str, arrayList);
        }
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.q(parcel, 5, this.e);
        atzr.o(parcel, 6, this.f);
        atzr.q(parcel, 7, this.g);
        atzr.v(parcel, 8, this.h, false);
        atzr.v(parcel, 9, this.i, false);
        atzr.v(parcel, 14, this.j, false);
        atzr.t(parcel, 15, this.k, i, false);
        atzr.t(parcel, 16, this.l, i, false);
        atzr.e(parcel, 18, this.m);
        atzr.e(parcel, 19, this.n);
        atzr.v(parcel, 20, this.o, false);
        atzr.v(parcel, 21, this.p, false);
        atzr.t(parcel, 22, this.q, i, false);
        atzr.v(parcel, 23, this.r, false);
        atzr.t(parcel, 24, this.s, i, false);
        atzr.v(parcel, 25, this.t, false);
        atzr.q(parcel, 29, this.u);
        atzr.t(parcel, 33, this.v, i, false);
        atzr.t(parcel, 35, this.w, i, false);
        atzr.e(parcel, 36, this.x);
        atzr.v(parcel, 37, this.y, false);
        atzr.c(parcel, a);
    }

    public PlayerEntity(Player player) {
        PlayerEntity playerEntity = (PlayerEntity) player;
        String str = playerEntity.a;
        this.a = str;
        String str2 = playerEntity.b;
        this.b = str2;
        this.c = playerEntity.c;
        this.h = playerEntity.h;
        this.d = playerEntity.d;
        this.i = playerEntity.i;
        long j = playerEntity.e;
        this.e = j;
        this.f = playerEntity.f;
        this.g = playerEntity.g;
        this.j = playerEntity.j;
        this.m = playerEntity.m;
        MostRecentGameInfoEntity mostRecentGameInfoEntity = playerEntity.k;
        this.k = mostRecentGameInfoEntity == null ? null : new MostRecentGameInfoEntity(mostRecentGameInfoEntity);
        this.l = playerEntity.l;
        this.n = playerEntity.n;
        this.o = playerEntity.o;
        this.p = playerEntity.p;
        this.q = playerEntity.q;
        this.r = playerEntity.r;
        this.s = playerEntity.s;
        this.t = playerEntity.t;
        this.u = playerEntity.u;
        PlayerRelationshipInfoEntity playerRelationshipInfoEntity = playerEntity.v;
        this.v = playerRelationshipInfoEntity == null ? null : new PlayerRelationshipInfoEntity(playerRelationshipInfoEntity);
        CurrentPlayerInfoEntity currentPlayerInfoEntity = playerEntity.w;
        this.w = currentPlayerInfoEntity != null ? currentPlayerInfoEntity : null;
        this.x = playerEntity.x;
        this.y = playerEntity.y;
        atvs.b(str);
        atvs.b(str2);
        atvs.e(j > 0);
    }

    @Override // defpackage.atqs
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
