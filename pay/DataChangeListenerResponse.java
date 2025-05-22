package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cvky;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class DataChangeListenerResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cvky();
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
            if (atyq.b(this.a, dataChangeListenerResponse.a) && atyq.b(this.b, dataChangeListenerResponse.b) && atyq.b(this.c, dataChangeListenerResponse.c)) {
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
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.t(parcel, 4, this.c, i, false);
        atzr.c(parcel, a);
    }

    public DataChangeListenerResponse(DataChangeListenerType dataChangeListenerType, SmartTapTransmissionData smartTapTransmissionData, EmoneyCardFinishSetupStatusData emoneyCardFinishSetupStatusData) {
        this.a = dataChangeListenerType;
        this.b = smartTapTransmissionData;
        this.c = emoneyCardFinishSetupStatusData;
    }
}
