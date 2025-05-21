package com.google.android.gms.vision.barcode.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.dibr;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class BarcodeDetectorOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dibr();
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
        return this.a == barcodeDetectorOptions.a && arwb.b(Boolean.valueOf(this.b), Boolean.valueOf(barcodeDetectorOptions.b));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Boolean.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 2, this.a);
        arxc.e(parcel, 3, this.b);
        arxc.c(parcel, a);
    }

    public BarcodeDetectorOptions(int i, boolean z) {
        this.a = i;
        this.b = z;
    }
}
