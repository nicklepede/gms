package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.czfx;
import defpackage.czga;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class InputPlaceCandidate extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new czga();
    public final FeatureId a;
    public final DevicePersonalizedPlaceInfo b;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class FeatureId extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new czfx();
        public final long a;
        public final long b;

        public FeatureId(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            long j = this.a;
            int a = arxc.a(parcel);
            arxc.q(parcel, 1, j);
            arxc.q(parcel, 2, this.b);
            arxc.c(parcel, a);
        }
    }

    public InputPlaceCandidate(FeatureId featureId, DevicePersonalizedPlaceInfo devicePersonalizedPlaceInfo) {
        this.a = featureId;
        this.b = devicePersonalizedPlaceInfo;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        FeatureId featureId = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, featureId, i, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.c(parcel, a);
    }
}
