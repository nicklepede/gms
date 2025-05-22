package com.google.android.gms.trustagent.internal;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dizv;
import defpackage.emus;
import defpackage.fgqp;
import defpackage.fgrc;
import defpackage.fgsd;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class ParcelableTrustAgentEvent implements Parcelable {
    public static final Parcelable.Creator CREATOR = new dizv();
    private byte[] a;
    private fgrc b;

    public ParcelableTrustAgentEvent(fgrc fgrcVar) {
        this.b = fgrcVar;
    }

    public final fgrc a() {
        if (this.b == null && this.a != null) {
            try {
                this.b = (fgrc) emus.a.v().D(this.a, fgqp.a());
                this.a = null;
            } catch (fgsd e) {
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
        parcel.writeByteArray(((emus) this.b.Q()).r());
    }

    public ParcelableTrustAgentEvent(Parcel parcel) {
        parcel.readString();
        this.a = parcel.createByteArray();
    }
}
