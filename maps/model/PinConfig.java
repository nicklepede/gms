package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.atzr;
import defpackage.bbln;
import defpackage.bblp;
import defpackage.ceml;
import defpackage.cems;
import defpackage.cenc;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class PinConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cenc();
    public final int a;
    public final int b;
    public final Glyph c;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class Glyph extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new cems();
        public final String a;
        public final ceml b;
        public int c;
        public int d;

        public Glyph(String str, IBinder iBinder, int i, int i2) {
            ceml cemlVar;
            this.c = -5041134;
            this.d = -16777216;
            this.a = str;
            if (iBinder == null) {
                cemlVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                cemlVar = new ceml(queryLocalInterface instanceof bblp ? (bblp) queryLocalInterface : new bbln(iBinder));
            }
            this.b = cemlVar;
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
            ceml cemlVar = this.b;
            if ((cemlVar == null && glyph.b != null) || (cemlVar != null && glyph.b == null)) {
                return false;
            }
            ceml cemlVar2 = glyph.b;
            if (cemlVar == null || cemlVar2 == null) {
                return true;
            }
            return Objects.equals(ObjectWrapper.a(cemlVar.a), ObjectWrapper.a(cemlVar2.a));
        }

        public final int hashCode() {
            return Objects.hash(this.a, this.b, Integer.valueOf(this.c));
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            String str = this.a;
            int a = atzr.a(parcel);
            atzr.v(parcel, 2, str, false);
            ceml cemlVar = this.b;
            atzr.D(parcel, 3, cemlVar == null ? null : cemlVar.a.asBinder());
            atzr.o(parcel, 4, this.c);
            atzr.o(parcel, 5, this.d);
            atzr.c(parcel, a);
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
        int a = atzr.a(parcel);
        atzr.o(parcel, 2, i2);
        atzr.o(parcel, 3, this.b);
        atzr.t(parcel, 4, this.c, i, false);
        atzr.c(parcel, a);
    }
}
