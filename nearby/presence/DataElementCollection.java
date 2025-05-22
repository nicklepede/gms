package com.google.android.gms.nearby.presence;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cmri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class DataElementCollection extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cmri();
    public final SequenceNumber a;
    public final CastIdentity b;
    public final byte[] c;
    public final boolean d;
    public final List e;
    public final List f;
    public final List g;
    public final UwbConnectivityCapability h;
    public final DeviceType i;

    public DataElementCollection(SequenceNumber sequenceNumber, CastIdentity castIdentity, byte[] bArr, boolean z, List list, List list2, List list3, UwbConnectivityCapability uwbConnectivityCapability, DeviceType deviceType) {
        this.a = sequenceNumber;
        this.b = castIdentity;
        this.c = bArr;
        this.d = z;
        this.e = list;
        this.f = list2;
        this.g = list3;
        this.h = uwbConnectivityCapability;
        this.i = deviceType;
    }

    public final List a() {
        ArrayList arrayList = new ArrayList();
        List list = this.e;
        if (list != null) {
            arrayList.addAll(list);
        }
        List list2 = this.f;
        if (list2 != null) {
            arrayList.addAll(list2);
        }
        List list3 = this.g;
        if (list3 != null) {
            arrayList.addAll(list3);
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof DataElementCollection) {
            DataElementCollection dataElementCollection = (DataElementCollection) obj;
            if (atyq.b(this.a, dataElementCollection.a) && atyq.b(this.b, dataElementCollection.b) && Arrays.equals(this.c, dataElementCollection.c) && this.d == dataElementCollection.d && atyq.b(this.e, dataElementCollection.e) && atyq.b(this.f, dataElementCollection.f) && atyq.b(this.g, dataElementCollection.g) && atyq.b(this.h, dataElementCollection.h) && atyq.b(this.i, dataElementCollection.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Boolean.valueOf(this.d), this.e, this.f, this.g, this.h, this.i});
    }

    public final String toString() {
        return String.format(Locale.US, "<DataElementCollection: sequenceNumber=%s, castId=%s, deduplicationHint=%s, deduplicationHintEnabled=%s, bleGattConnectivityInfo = %s, wifiLanConnectivityInfoList = %s, bluetoothConnectivityInfoList = %s, connectivityCapability = %s, deviceType = %s>", this.a, this.b, Arrays.toString(this.c), Boolean.valueOf(this.d), this.e, this.f, this.g, this.h, this.i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        SequenceNumber sequenceNumber = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, sequenceNumber, i, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.i(parcel, 3, this.c, false);
        atzr.e(parcel, 4, this.d);
        atzr.y(parcel, 5, this.e, false);
        atzr.y(parcel, 6, this.f, false);
        atzr.y(parcel, 7, this.g, false);
        atzr.t(parcel, 8, this.h, i, false);
        atzr.t(parcel, 9, this.i, i, false);
        atzr.c(parcel, a);
    }
}
