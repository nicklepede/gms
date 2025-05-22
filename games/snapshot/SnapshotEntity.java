package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bjwq;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class SnapshotEntity extends GamesAbstractSafeParcelable implements Snapshot {
    public static final Parcelable.Creator CREATOR = new bjwq();
    public final SnapshotMetadataEntity a;
    private final SnapshotContentsEntity b;

    public SnapshotEntity(SnapshotMetadata snapshotMetadata, SnapshotContentsEntity snapshotContentsEntity) {
        this.a = new SnapshotMetadataEntity(snapshotMetadata);
        this.b = snapshotContentsEntity;
    }

    @Override // com.google.android.gms.games.snapshot.Snapshot
    public final SnapshotContents a() {
        SnapshotContentsEntity snapshotContentsEntity = this.b;
        if (snapshotContentsEntity.a == null) {
            return null;
        }
        return snapshotContentsEntity;
    }

    @Override // com.google.android.gms.games.snapshot.Snapshot
    public final SnapshotMetadata b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Snapshot)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Snapshot snapshot = (Snapshot) obj;
        return atyq.b(snapshot.b(), this.a) && atyq.b(snapshot.a(), a());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, a()});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("Metadata", this.a, arrayList);
        atyp.b("HasContents", Boolean.valueOf(a() != null), arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        SnapshotMetadataEntity snapshotMetadataEntity = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, snapshotMetadataEntity, i, false);
        atzr.t(parcel, 3, a(), i, false);
        atzr.c(parcel, a);
    }

    @Override // defpackage.atqs
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
