package com.google.android.gms.vision.barcode.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.dknc;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class BarcodeDetectorOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dknc();
    public int a;
    public boolean b;

    public BarcodeDetectorOptions() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BarcodeDetectorOptions)) {
            return false;
        }
        BarcodeDetectorOptions barcodeDetectorOptions = (BarcodeDetectorOptions) obj;
        return this.a == barcodeDetectorOptions.a && atyq.b(Boolean.valueOf(this.b), Boolean.valueOf(barcodeDetectorOptions.b));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Boolean.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 2, this.a);
        atzr.e(parcel, 3, this.b);
        atzr.c(parcel, a);
    }

    public BarcodeDetectorOptions(int i, boolean z) {
        this.a = i;
        this.b = z;
    }
}
