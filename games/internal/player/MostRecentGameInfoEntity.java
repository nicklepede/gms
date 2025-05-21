package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bhpm;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class MostRecentGameInfoEntity extends GamesAbstractSafeParcelable implements MostRecentGameInfo {
    public static final Parcelable.Creator CREATOR = new bhpm();
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
        return arwb.b(mostRecentGameInfo.e(), this.a) && arwb.b(mostRecentGameInfo.f(), this.b) && arwb.b(Long.valueOf(mostRecentGameInfo.a()), Long.valueOf(this.c)) && arwb.b(mostRecentGameInfo.d(), this.d) && arwb.b(mostRecentGameInfo.c(), this.e) && arwb.b(mostRecentGameInfo.b(), this.f);
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
        arwa.b("GameId", this.a, arrayList);
        arwa.b("GameName", this.b, arrayList);
        arwa.b("ActivityTimestampMillis", Long.valueOf(this.c), arrayList);
        arwa.b("GameIconUri", this.d, arrayList);
        arwa.b("GameHiResUri", this.e, arrayList);
        arwa.b("GameFeaturedUri", this.f, arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.q(parcel, 3, this.c);
        arxc.t(parcel, 4, this.d, i, false);
        arxc.t(parcel, 5, this.e, i, false);
        arxc.t(parcel, 6, this.f, i, false);
        arxc.c(parcel, a);
    }

    public MostRecentGameInfoEntity(String str, String str2, long j, Uri uri, Uri uri2, Uri uri3) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = uri;
        this.e = uri2;
        this.f = uri3;
    }

    @Override // defpackage.arod
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
