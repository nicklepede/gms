package com.google.android.gms.games.snapshot;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bhsd;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class SnapshotMetadataEntity extends GamesAbstractSafeParcelable implements SnapshotMetadata {
    public static final Parcelable.Creator CREATOR = new bhsd();
    public final GameEntity a;
    public final PlayerEntity b;
    public final String c;
    public final Uri d;
    public final String e;
    public final String f;
    public final String g;
    public final long h;
    public final long i;
    public final float j;
    public final String k;
    public final boolean l;
    public final long m;
    public final String n;

    public SnapshotMetadataEntity(GameEntity gameEntity, PlayerEntity playerEntity, String str, Uri uri, String str2, String str3, String str4, long j, long j2, float f, String str5, boolean z, long j3, String str6) {
        this.a = gameEntity;
        this.b = playerEntity;
        this.c = str;
        this.d = uri;
        this.e = str2;
        this.j = f;
        this.f = str3;
        this.g = str4;
        this.h = j;
        this.i = j2;
        this.k = str5;
        this.l = z;
        this.m = j3;
        this.n = str6;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public final float a() {
        return this.j;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public final long b() {
        return this.h;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public final long c() {
        return this.i;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public final long d() {
        return this.m;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public final Uri e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SnapshotMetadata)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        SnapshotMetadata snapshotMetadata = (SnapshotMetadata) obj;
        return arwb.b(snapshotMetadata.f(), this.a) && arwb.b(snapshotMetadata.g(), this.b) && arwb.b(snapshotMetadata.j(), this.c) && arwb.b(snapshotMetadata.e(), this.d) && arwb.b(Float.valueOf(snapshotMetadata.a()), Float.valueOf(this.j)) && arwb.b(snapshotMetadata.k(), this.f) && arwb.b(snapshotMetadata.h(), this.g) && arwb.b(Long.valueOf(snapshotMetadata.b()), Long.valueOf(this.h)) && arwb.b(Long.valueOf(snapshotMetadata.c()), Long.valueOf(this.i)) && arwb.b(snapshotMetadata.m(), this.k) && arwb.b(Boolean.valueOf(snapshotMetadata.n()), Boolean.valueOf(this.l)) && arwb.b(Long.valueOf(snapshotMetadata.d()), Long.valueOf(this.m)) && arwb.b(snapshotMetadata.i(), this.n);
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public final Game f() {
        return this.a;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public final Player g() {
        return this.b;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public final String h() {
        return this.g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, Float.valueOf(this.j), this.f, this.g, Long.valueOf(this.h), Long.valueOf(this.i), this.k, Boolean.valueOf(this.l), Long.valueOf(this.m), this.n});
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public final String i() {
        return this.n;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public final String j() {
        return this.c;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public final String k() {
        return this.f;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public final String m() {
        return this.k;
    }

    @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
    public final boolean n() {
        return this.l;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("Game", this.a, arrayList);
        arwa.b("Owner", this.b, arrayList);
        arwa.b("SnapshotId", this.c, arrayList);
        arwa.b("CoverImageUri", this.d, arrayList);
        arwa.b("CoverImageUrl", this.e, arrayList);
        arwa.b("CoverImageAspectRatio", Float.valueOf(this.j), arrayList);
        arwa.b("Description", this.g, arrayList);
        arwa.b("LastModifiedTimestamp", Long.valueOf(this.h), arrayList);
        arwa.b("PlayedTime", Long.valueOf(this.i), arrayList);
        arwa.b("UniqueName", this.k, arrayList);
        arwa.b("ChangePending", Boolean.valueOf(this.l), arrayList);
        arwa.b("ProgressValue", Long.valueOf(this.m), arrayList);
        arwa.b("DeviceName", this.n, arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        GameEntity gameEntity = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, gameEntity, i, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.t(parcel, 5, this.d, i, false);
        arxc.v(parcel, 6, this.e, false);
        arxc.v(parcel, 7, this.f, false);
        arxc.v(parcel, 8, this.g, false);
        arxc.q(parcel, 9, this.h);
        arxc.q(parcel, 10, this.i);
        arxc.l(parcel, 11, this.j);
        arxc.v(parcel, 12, this.k, false);
        arxc.e(parcel, 13, this.l);
        arxc.q(parcel, 14, this.m);
        arxc.v(parcel, 15, this.n, false);
        arxc.c(parcel, a);
    }

    public SnapshotMetadataEntity(SnapshotMetadata snapshotMetadata) {
        SnapshotMetadataEntity snapshotMetadataEntity = (SnapshotMetadataEntity) snapshotMetadata;
        PlayerEntity playerEntity = new PlayerEntity(snapshotMetadataEntity.b);
        this.a = new GameEntity(snapshotMetadataEntity.a);
        this.b = playerEntity;
        this.c = snapshotMetadataEntity.c;
        this.d = snapshotMetadataEntity.d;
        this.e = snapshotMetadataEntity.e;
        this.j = snapshotMetadataEntity.j;
        this.f = snapshotMetadataEntity.f;
        this.g = snapshotMetadataEntity.g;
        this.h = snapshotMetadataEntity.h;
        this.i = snapshotMetadataEntity.i;
        this.k = snapshotMetadataEntity.k;
        this.l = snapshotMetadataEntity.l;
        this.m = snapshotMetadataEntity.m;
        this.n = snapshotMetadataEntity.n;
    }

    @Override // defpackage.arod
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
