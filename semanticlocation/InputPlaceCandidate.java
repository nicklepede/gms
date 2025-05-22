package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dbpv;
import defpackage.dbpy;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class InputPlaceCandidate extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dbpy();
    public final FeatureId a;
    public final DevicePersonalizedPlaceInfo b;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class FeatureId extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new dbpv();
        public final long a;
        public final long b;

        public FeatureId(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            long j = this.a;
            int a = atzr.a(parcel);
            atzr.q(parcel, 1, j);
            atzr.q(parcel, 2, this.b);
            atzr.c(parcel, a);
        }
    }

    public InputPlaceCandidate(FeatureId featureId, DevicePersonalizedPlaceInfo devicePersonalizedPlaceInfo) {
        this.a = featureId;
        this.b = devicePersonalizedPlaceInfo;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        FeatureId featureId = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, featureId, i, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.c(parcel, a);
    }
}
