package com.google.android.gms.fonts;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atau;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.auub;
import defpackage.bjft;
import java.io.File;
import java.io.FileNotFoundException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class FontFetchResult extends AbstractSafeParcelable implements atau {
    public static final Parcelable.Creator CREATOR = new bjft();
    private static final Status f = new Status(8, "File missing");
    private static final Status g = new Status(8, "Unable to get FD");
    final int a;
    public final Status b;
    public final String c;
    public final ParcelFileDescriptor d;
    public final FontMatchSpec e;

    public FontFetchResult(int i, Status status, String str, ParcelFileDescriptor parcelFileDescriptor, FontMatchSpec fontMatchSpec) {
        this.a = i;
        atzb.t(status, "status");
        this.b = status;
        this.c = str;
        this.d = parcelFileDescriptor;
        this.e = fontMatchSpec;
        if (i >= 2) {
            boolean z = status.e() != (fontMatchSpec == null);
            String str2 = true != status.e() ? "" : "not ";
            atzb.m(z, "spec must be " + str2 + "null for " + String.valueOf(status));
        }
    }

    public static FontFetchResult b(Status status) {
        atzb.t(status, "failureStatus");
        atzb.m(!status.e(), "Failure status cannot be successful: ".concat(String.valueOf(String.valueOf(status))));
        return new FontFetchResult(2, status, null, null, null);
    }

    public static FontFetchResult c(FontMatchSpec fontMatchSpec, File file) {
        if (!file.exists()) {
            return b(f);
        }
        try {
            ParcelFileDescriptor open = ParcelFileDescriptor.open(file, 268435456);
            return new FontFetchResult(2, Status.b, !auub.a() ? file.getAbsolutePath() : null, open, fontMatchSpec);
        } catch (FileNotFoundException unused) {
            return b(g);
        }
    }

    @Override // defpackage.atau
    public final Status a() {
        return this.b;
    }

    public final String toString() {
        return String.format("{%s, %s, %s}", this.b, this.c, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.t(parcel, 5, this.e, i, false);
        atzr.c(parcel, a);
    }
}
