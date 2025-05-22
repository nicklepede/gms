package com.google.android.gms.dtdi.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dtdi.core.AnalyticsInfo;
import com.google.android.gms.dtdi.core.WakeUpRequest;
import com.google.android.gms.dtdi.discovery.DiscoveryParams;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bazm;
import defpackage.bbaa;
import defpackage.bbab;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class CreateDevicePickerIntentParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bazm();
    public DiscoveryParams a;
    public long b;
    public bbab c;
    public WakeUpRequest d;
    public AnalyticsInfo e;
    public int f;

    private CreateDevicePickerIntentParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CreateDevicePickerIntentParams) {
            CreateDevicePickerIntentParams createDevicePickerIntentParams = (CreateDevicePickerIntentParams) obj;
            if (atyq.b(this.a, createDevicePickerIntentParams.a) && atyq.b(Long.valueOf(this.b), Long.valueOf(createDevicePickerIntentParams.b)) && atyq.b(this.c, createDevicePickerIntentParams.c) && atyq.b(this.d, createDevicePickerIntentParams.d) && atyq.b(this.e, createDevicePickerIntentParams.e) && atyq.b(Integer.valueOf(this.f), Integer.valueOf(createDevicePickerIntentParams.f))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(this.b), this.c, this.d, this.e, Integer.valueOf(this.f)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.q(parcel, 2, this.b);
        bbab bbabVar = this.c;
        atzr.D(parcel, 3, bbabVar == null ? null : bbabVar.asBinder());
        atzr.t(parcel, 4, this.d, i, false);
        atzr.t(parcel, 5, this.e, i, false);
        atzr.o(parcel, 6, this.f);
        atzr.c(parcel, a);
    }

    public CreateDevicePickerIntentParams(DiscoveryParams discoveryParams, long j, IBinder iBinder, WakeUpRequest wakeUpRequest, AnalyticsInfo analyticsInfo, int i) {
        bbab bbaaVar;
        if (iBinder == null) {
            bbaaVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dtdi.core.internal.ICreateDevicePickerIntentCallback");
            bbaaVar = queryLocalInterface instanceof bbab ? (bbab) queryLocalInterface : new bbaa(iBinder);
        }
        this.a = discoveryParams;
        this.b = j;
        this.c = bbaaVar;
        this.d = wakeUpRequest;
        this.e = analyticsInfo;
        this.f = i;
    }
}
