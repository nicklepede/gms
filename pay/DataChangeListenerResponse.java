package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ctbt;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class DataChangeListenerResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctbt();
    public DataChangeListenerType a;
    public SmartTapTransmissionData b;
    public EmoneyCardFinishSetupStatusData c;

    private DataChangeListenerResponse() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DataChangeListenerResponse) {
            DataChangeListenerResponse dataChangeListenerResponse = (DataChangeListenerResponse) obj;
            if (arwb.b(this.a, dataChangeListenerResponse.a) && arwb.b(this.b, dataChangeListenerResponse.b) && arwb.b(this.c, dataChangeListenerResponse.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.t(parcel, 4, this.c, i, false);
        arxc.c(parcel, a);
    }

    public DataChangeListenerResponse(DataChangeListenerType dataChangeListenerType, SmartTapTransmissionData smartTapTransmissionData, EmoneyCardFinishSetupStatusData emoneyCardFinishSetupStatusData) {
        this.a = dataChangeListenerType;
        this.b = smartTapTransmissionData;
        this.c = emoneyCardFinishSetupStatusData;
    }
}
