package com.google.android.gms.games.snapshot;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bjws;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class SnapshotMetadataEntity extends GamesAbstractSafeParcelable implements SnapshotMetadata {
    public static final Parcelable.Creator CREATOR = new bjws();
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
        return atyq.b(snapshotMetadata.f(), this.a) && atyq.b(snapshotMetadata.g(), this.b) && atyq.b(snapshotMetadata.j(), this.c) && atyq.b(snapshotMetadata.e(), this.d) && atyq.b(Float.valueOf(snapshotMetadata.a()), Float.valueOf(this.j)) && atyq.b(snapshotMetadata.k(), this.f) && atyq.b(snapshotMetadata.h(), this.g) && atyq.b(Long.valueOf(snapshotMetadata.b()), Long.valueOf(this.h)) && atyq.b(Long.valueOf(snapshotMetadata.c()), Long.valueOf(this.i)) && atyq.b(snapshotMetadata.m(), this.k) && atyq.b(Boolean.valueOf(snapshotMetadata.n()), Boolean.valueOf(this.l)) && atyq.b(Long.valueOf(snapshotMetadata.d()), Long.valueOf(this.m)) && atyq.b(snapshotMetadata.i(), this.n);
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
        atyp.b("Game", this.a, arrayList);
        atyp.b("Owner", this.b, arrayList);
        atyp.b("SnapshotId", this.c, arrayList);
        atyp.b("CoverImageUri", this.d, arrayList);
        atyp.b("CoverImageUrl", this.e, arrayList);
        atyp.b("CoverImageAspectRatio", Float.valueOf(this.j), arrayList);
        atyp.b("Description", this.g, arrayList);
        atyp.b("LastModifiedTimestamp", Long.valueOf(this.h), arrayList);
        atyp.b("PlayedTime", Long.valueOf(this.i), arrayList);
        atyp.b("UniqueName", this.k, arrayList);
        atyp.b("ChangePending", Boolean.valueOf(this.l), arrayList);
        atyp.b("ProgressValue", Long.valueOf(this.m), arrayList);
        atyp.b("DeviceName", this.n, arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        GameEntity gameEntity = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, gameEntity, i, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.t(parcel, 5, this.d, i, false);
        atzr.v(parcel, 6, this.e, false);
        atzr.v(parcel, 7, this.f, false);
        atzr.v(parcel, 8, this.g, false);
        atzr.q(parcel, 9, this.h);
        atzr.q(parcel, 10, this.i);
        atzr.l(parcel, 11, this.j);
        atzr.v(parcel, 12, this.k, false);
        atzr.e(parcel, 13, this.l);
        atzr.q(parcel, 14, this.m);
        atzr.v(parcel, 15, this.n, false);
        atzr.c(parcel, a);
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

    @Override // defpackage.atqs
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
