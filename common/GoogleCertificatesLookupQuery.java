package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.aqtb;
import defpackage.aque;
import defpackage.arxc;
import defpackage.azhr;
import defpackage.azht;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class GoogleCertificatesLookupQuery extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aque();
    public final String a;
    public final boolean b;
    public final boolean c;
    public final Context d;
    public final boolean e;
    public final boolean f;
    public final ClientSourceStampRequest g;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class ClientSourceStampRequest extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new aqtb();
        public final int a;
        public final boolean b;

        public ClientSourceStampRequest(int i, boolean z) {
            this.a = i;
            this.b = z;
        }

        public final int a() {
            int[] iArr = {1, 2, 3};
            for (int i = 0; i < 3; i++) {
                int i2 = iArr[i];
                int i3 = i2 - 1;
                if (i2 == 0) {
                    throw null;
                }
                if (i3 == this.a) {
                    return i2;
                }
            }
            return 1;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int i2 = this.a;
            int a = arxc.a(parcel);
            arxc.o(parcel, 1, i2);
            arxc.e(parcel, 2, this.b);
            arxc.c(parcel, a);
        }
    }

    public GoogleCertificatesLookupQuery(String str, boolean z, boolean z2, IBinder iBinder, boolean z3, boolean z4, ClientSourceStampRequest clientSourceStampRequest) {
        azht azhrVar;
        this.a = str;
        this.b = z;
        this.c = z2;
        if (iBinder == null) {
            azhrVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            azhrVar = queryLocalInterface instanceof azht ? (azht) queryLocalInterface : new azhr(iBinder);
        }
        this.d = (Context) ObjectWrapper.a(azhrVar);
        this.e = z3;
        this.f = z4;
        this.g = clientSourceStampRequest;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.e(parcel, 2, this.b);
        arxc.e(parcel, 3, this.c);
        arxc.D(parcel, 4, new ObjectWrapper(this.d));
        arxc.e(parcel, 5, this.e);
        arxc.e(parcel, 6, this.f);
        arxc.t(parcel, 7, this.g, i, false);
        arxc.c(parcel, a);
    }
}
