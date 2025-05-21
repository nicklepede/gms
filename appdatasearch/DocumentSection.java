package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.tre;
import defpackage.tro;
import defpackage.tsa;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class DocumentSection extends AbstractSafeParcelable {
    public static final RegisterSectionInfo b;
    public final String c;
    public final RegisterSectionInfo d;
    public final int e;
    public final byte[] f;
    public static final int a = Integer.parseInt("-1");
    public static final Parcelable.Creator CREATOR = new tre();

    static {
        tsa tsaVar = new tsa("SsbContext");
        tsaVar.b = true;
        tsaVar.a = "blob";
        b = tsaVar.a();
    }

    public DocumentSection(String str, RegisterSectionInfo registerSectionInfo) {
        this(str, registerSectionInfo, a, null);
    }

    public final String a() {
        int i = this.e;
        if (i != a && tro.b(i) == null) {
            return a.j(i, "Invalid section type ");
        }
        if (this.c == null || this.f == null) {
            return null;
        }
        return "Both content and blobContent set";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.c;
        int a2 = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.t(parcel, 3, this.d, i, false);
        arxc.o(parcel, 4, this.e);
        arxc.i(parcel, 5, this.f, false);
        arxc.c(parcel, a2);
    }

    public DocumentSection(String str, RegisterSectionInfo registerSectionInfo, int i, byte[] bArr) {
        boolean z = true;
        if (i != a && tro.b(i) == null) {
            z = false;
        }
        arwm.c(z, a.j(i, "Invalid section type "));
        this.c = str;
        this.d = registerSectionInfo;
        this.e = i;
        this.f = bArr;
        String a2 = a();
        if (a2 != null) {
            throw new IllegalArgumentException(a2);
        }
    }

    public DocumentSection(byte[] bArr, RegisterSectionInfo registerSectionInfo) {
        this(null, registerSectionInfo, a, bArr);
    }
}
