package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.binn;
import defpackage.bipq;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class GetSyncInfoRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bipq();
    public final binn a;

    public GetSyncInfoRequest(binn binnVar) {
        this.a = binnVar;
    }

    public final String toString() {
        return String.format(Locale.US, "GetSyncInfoRequest {%s}", this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.D(parcel, 1, this.a.a);
        atzr.c(parcel, a);
    }

    public GetSyncInfoRequest(IBinder iBinder) {
        binn binnVar;
        if (iBinder == null) {
            binnVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.ISyncInfoCallback");
            binnVar = queryLocalInterface instanceof binn ? (binn) queryLocalInterface : new binn(iBinder);
        }
        this.a = binnVar;
    }
}
