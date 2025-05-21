package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.arxc;
import defpackage.azhr;
import defpackage.azht;
import defpackage.ccdr;
import defpackage.ccdy;
import defpackage.ccei;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class PinConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ccei();
    public final int a;
    public final int b;
    public final Glyph c;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class Glyph extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new ccdy();
        public final String a;
        public final ccdr b;
        public int c;
        public int d;

        public Glyph(String str, IBinder iBinder, int i, int i2) {
            ccdr ccdrVar;
            this.c = -5041134;
            this.d = -16777216;
            this.a = str;
            if (iBinder == null) {
                ccdrVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                ccdrVar = new ccdr(queryLocalInterface instanceof azht ? (azht) queryLocalInterface : new azhr(iBinder));
            }
            this.b = ccdrVar;
            this.c = i;
            this.d = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Glyph)) {
                return false;
            }
            Glyph glyph = (Glyph) obj;
            if (this.c != glyph.c || !Objects.equals(this.a, glyph.a) || this.d != glyph.d) {
                return false;
            }
            ccdr ccdrVar = this.b;
            if ((ccdrVar == null && glyph.b != null) || (ccdrVar != null && glyph.b == null)) {
                return false;
            }
            ccdr ccdrVar2 = glyph.b;
            if (ccdrVar == null || ccdrVar2 == null) {
                return true;
            }
            return Objects.equals(ObjectWrapper.a(ccdrVar.a), ObjectWrapper.a(ccdrVar2.a));
        }

        public final int hashCode() {
            return Objects.hash(this.a, this.b, Integer.valueOf(this.c));
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            String str = this.a;
            int a = arxc.a(parcel);
            arxc.v(parcel, 2, str, false);
            ccdr ccdrVar = this.b;
            arxc.D(parcel, 3, ccdrVar == null ? null : ccdrVar.a.asBinder());
            arxc.o(parcel, 4, this.c);
            arxc.o(parcel, 5, this.d);
            arxc.c(parcel, a);
        }
    }

    public PinConfig(int i, int i2, Glyph glyph) {
        this.a = i;
        this.b = i2;
        this.c = glyph;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = arxc.a(parcel);
        arxc.o(parcel, 2, i2);
        arxc.o(parcel, 3, this.b);
        arxc.t(parcel, 4, this.c, i, false);
        arxc.c(parcel, a);
    }
}
