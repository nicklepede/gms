package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cvku;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class BulkImportUcpMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cvku();
    public boolean a;
    public String[] b;

    private BulkImportUcpMetadata() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BulkImportUcpMetadata) {
            BulkImportUcpMetadata bulkImportUcpMetadata = (BulkImportUcpMetadata) obj;
            if (atyq.b(Boolean.valueOf(this.a), Boolean.valueOf(bulkImportUcpMetadata.a)) && Arrays.equals(this.b, bulkImportUcpMetadata.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Integer.valueOf(Arrays.hashCode(this.b))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.e(parcel, 1, this.a);
        atzr.w(parcel, 2, this.b, false);
        atzr.c(parcel, a);
    }

    public BulkImportUcpMetadata(boolean z, String[] strArr) {
        this.a = z;
        this.b = strArr;
    }
}
