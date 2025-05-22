package com.google.android.gms.nearby.sharing;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cohj;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class QrCodeMetadata extends AbstractSafeParcelable implements Cloneable {
    public static final Parcelable.Creator CREATOR = new cohj();
    public final byte[] a;
    public final int b;

    public QrCodeMetadata(byte[] bArr, int i) {
        this.a = bArr;
        this.b = i;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final QrCodeMetadata clone() {
        try {
            return (QrCodeMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof QrCodeMetadata) {
            QrCodeMetadata qrCodeMetadata = (QrCodeMetadata) obj;
            if (Arrays.equals(this.a, qrCodeMetadata.a) && this.b == qrCodeMetadata.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), Integer.valueOf(this.b)});
    }

    public final String toString() {
        return String.format(Locale.US, "QrCodeMetadata<sharedKey: %s, keyType: %s>", Arrays.toString(this.a), Integer.valueOf(this.b));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int a = atzr.a(parcel);
        atzr.i(parcel, 1, bArr, false);
        atzr.o(parcel, 2, this.b);
        atzr.c(parcel, a);
    }
}
