package com.google.android.gms.trustagent.internal;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dgoq;
import defpackage.ekhg;
import defpackage.febw;
import defpackage.fecj;
import defpackage.fedk;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class ParcelableTrustAgentEvent implements Parcelable {
    public static final Parcelable.Creator CREATOR = new dgoq();
    private byte[] a;
    private fecj b;

    public ParcelableTrustAgentEvent(fecj fecjVar) {
        this.b = fecjVar;
    }

    public final fecj a() {
        if (this.b == null && this.a != null) {
            try {
                this.b = (fecj) ekhg.a.v().D(this.a, febw.a());
                this.a = null;
            } catch (fedk e) {
                throw new IllegalStateException(e);
            }
        }
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString("com.google.common.logging.nano.AndroidAuthLogsProto.TrustAgentEvent");
        parcel.writeByteArray(((ekhg) this.b.Q()).r());
    }

    public ParcelableTrustAgentEvent(Parcel parcel) {
        parcel.readString();
        this.a = parcel.createByteArray();
    }
}
