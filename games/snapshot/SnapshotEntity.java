package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bhsb;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class SnapshotEntity extends GamesAbstractSafeParcelable implements Snapshot {
    public static final Parcelable.Creator CREATOR = new bhsb();
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
        return arwb.b(snapshot.b(), this.a) && arwb.b(snapshot.a(), a());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, a()});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("Metadata", this.a, arrayList);
        arwa.b("HasContents", Boolean.valueOf(a() != null), arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        SnapshotMetadataEntity snapshotMetadataEntity = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, snapshotMetadataEntity, i, false);
        arxc.t(parcel, 3, a(), i, false);
        arxc.c(parcel, a);
    }

    @Override // defpackage.arod
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
