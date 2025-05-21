package com.google.android.gms.dtdi.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dtdi.core.AnalyticsInfo;
import com.google.android.gms.dtdi.core.WakeUpRequest;
import com.google.android.gms.dtdi.discovery.DiscoveryParams;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ayvs;
import defpackage.aywg;
import defpackage.aywh;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class CreateDevicePickerIntentParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ayvs();
    public DiscoveryParams a;
    public long b;
    public aywh c;
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
            if (arwb.b(this.a, createDevicePickerIntentParams.a) && arwb.b(Long.valueOf(this.b), Long.valueOf(createDevicePickerIntentParams.b)) && arwb.b(this.c, createDevicePickerIntentParams.c) && arwb.b(this.d, createDevicePickerIntentParams.d) && arwb.b(this.e, createDevicePickerIntentParams.e) && arwb.b(Integer.valueOf(this.f), Integer.valueOf(createDevicePickerIntentParams.f))) {
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
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.q(parcel, 2, this.b);
        aywh aywhVar = this.c;
        arxc.D(parcel, 3, aywhVar == null ? null : aywhVar.asBinder());
        arxc.t(parcel, 4, this.d, i, false);
        arxc.t(parcel, 5, this.e, i, false);
        arxc.o(parcel, 6, this.f);
        arxc.c(parcel, a);
    }

    public CreateDevicePickerIntentParams(DiscoveryParams discoveryParams, long j, IBinder iBinder, WakeUpRequest wakeUpRequest, AnalyticsInfo analyticsInfo, int i) {
        aywh aywgVar;
        if (iBinder == null) {
            aywgVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dtdi.core.internal.ICreateDevicePickerIntentCallback");
            aywgVar = queryLocalInterface instanceof aywh ? (aywh) queryLocalInterface : new aywg(iBinder);
        }
        this.a = discoveryParams;
        this.b = j;
        this.c = aywgVar;
        this.d = wakeUpRequest;
        this.e = analyticsInfo;
        this.f = i;
    }
}
