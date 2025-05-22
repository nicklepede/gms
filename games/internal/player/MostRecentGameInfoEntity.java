package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bjub;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class MostRecentGameInfoEntity extends GamesAbstractSafeParcelable implements MostRecentGameInfo {
    public static final Parcelable.Creator CREATOR = new bjub();
    public final String a;
    public final String b;
    public final long c;
    public final Uri d;
    public final Uri e;
    public final Uri f;

    public MostRecentGameInfoEntity(MostRecentGameInfo mostRecentGameInfo) {
        MostRecentGameInfoEntity mostRecentGameInfoEntity = (MostRecentGameInfoEntity) mostRecentGameInfo;
        this.a = mostRecentGameInfoEntity.a;
        this.b = mostRecentGameInfoEntity.b;
        this.c = mostRecentGameInfoEntity.c;
        this.d = mostRecentGameInfoEntity.d;
        this.e = mostRecentGameInfoEntity.e;
        this.f = mostRecentGameInfoEntity.f;
    }

    @Override // com.google.android.gms.games.internal.player.MostRecentGameInfo
    public final long a() {
        return this.c;
    }

    @Override // com.google.android.gms.games.internal.player.MostRecentGameInfo
    public final Uri b() {
        return this.f;
    }

    @Override // com.google.android.gms.games.internal.player.MostRecentGameInfo
    public final Uri c() {
        return this.e;
    }

    @Override // com.google.android.gms.games.internal.player.MostRecentGameInfo
    public final Uri d() {
        return this.d;
    }

    @Override // com.google.android.gms.games.internal.player.MostRecentGameInfo
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof MostRecentGameInfo)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        MostRecentGameInfo mostRecentGameInfo = (MostRecentGameInfo) obj;
        return atyq.b(mostRecentGameInfo.e(), this.a) && atyq.b(mostRecentGameInfo.f(), this.b) && atyq.b(Long.valueOf(mostRecentGameInfo.a()), Long.valueOf(this.c)) && atyq.b(mostRecentGameInfo.d(), this.d) && atyq.b(mostRecentGameInfo.c(), this.e) && atyq.b(mostRecentGameInfo.b(), this.f);
    }

    @Override // com.google.android.gms.games.internal.player.MostRecentGameInfo
    public final String f() {
        return this.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Long.valueOf(this.c), this.d, this.e, this.f});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("GameId", this.a, arrayList);
        atyp.b("GameName", this.b, arrayList);
        atyp.b("ActivityTimestampMillis", Long.valueOf(this.c), arrayList);
        atyp.b("GameIconUri", this.d, arrayList);
        atyp.b("GameHiResUri", this.e, arrayList);
        atyp.b("GameFeaturedUri", this.f, arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.q(parcel, 3, this.c);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.t(parcel, 5, this.e, i, false);
        atzr.t(parcel, 6, this.f, i, false);
        atzr.c(parcel, a);
    }

    public MostRecentGameInfoEntity(String str, String str2, long j, Uri uri, Uri uri2, Uri uri3) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = uri;
        this.e = uri2;
        this.f = uri3;
    }

    @Override // defpackage.atqs
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
