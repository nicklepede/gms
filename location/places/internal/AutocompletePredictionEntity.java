package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.style.CharacterStyle;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.ccmj;
import defpackage.ccok;
import defpackage.ccoq;
import defpackage.ccpw;
import defpackage.elgo;
import defpackage.elpg;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class AutocompletePredictionEntity extends AbstractSafeParcelable implements ccmj {
    public static final Parcelable.Creator CREATOR = new ccok();
    public final String a;
    public final String b;
    public final List c;
    public final List d;
    public final int e;
    public final String f;
    public final List g;
    public final String h;
    public final List i;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class SubstringEntity extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new ccpw();
        public final int a;
        public final int b;

        public SubstringEntity(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SubstringEntity)) {
                return false;
            }
            SubstringEntity substringEntity = (SubstringEntity) obj;
            return atyq.b(Integer.valueOf(this.a), Integer.valueOf(substringEntity.a)) && atyq.b(Integer.valueOf(this.b), Integer.valueOf(substringEntity.b));
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b)});
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            atyp.b("offset", Integer.valueOf(this.a), arrayList);
            atyp.b("length", Integer.valueOf(this.b), arrayList);
            return atyp.a(arrayList, this);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int a = atzr.a(parcel);
            atzr.o(parcel, 1, this.a);
            atzr.o(parcel, 2, this.b);
            atzr.c(parcel, a);
        }
    }

    static {
        int i = elgo.d;
        elgo elgoVar = elpg.a;
    }

    public AutocompletePredictionEntity(String str, List list, int i, String str2, List list2, String str3, List list3, String str4, List list4) {
        this.b = str;
        this.c = list;
        this.e = i;
        this.a = str2;
        this.d = list2;
        this.f = str3;
        this.g = list3;
        this.h = str4;
        this.i = list4;
    }

    @Override // defpackage.ccmj
    public final CharSequence a(CharacterStyle characterStyle) {
        return ccoq.a(this.f, this.g, characterStyle);
    }

    @Override // defpackage.ccmj
    public final String b() {
        return this.a;
    }

    @Override // defpackage.ccmj
    public final String c() {
        return this.b;
    }

    @Override // defpackage.ccmj
    public final CharSequence d() {
        return ccoq.a(this.a, this.d, null);
    }

    @Override // defpackage.ccmj
    public final CharSequence e() {
        return ccoq.a(this.h, this.i, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutocompletePredictionEntity)) {
            return false;
        }
        AutocompletePredictionEntity autocompletePredictionEntity = (AutocompletePredictionEntity) obj;
        return atyq.b(this.b, autocompletePredictionEntity.b) && atyq.b(this.c, autocompletePredictionEntity.c) && atyq.b(Integer.valueOf(this.e), Integer.valueOf(autocompletePredictionEntity.e)) && atyq.b(this.a, autocompletePredictionEntity.a) && atyq.b(this.d, autocompletePredictionEntity.d) && atyq.b(this.f, autocompletePredictionEntity.f) && atyq.b(this.g, autocompletePredictionEntity.g) && atyq.b(this.h, autocompletePredictionEntity.h) && atyq.b(this.i, autocompletePredictionEntity.i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, Integer.valueOf(this.e), this.a, this.d, this.f, this.g, this.h, this.i});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("placeId", this.b, arrayList);
        atyp.b("placeTypes", this.c, arrayList);
        atyp.b("fullText", this.a, arrayList);
        atyp.b("fullTextMatchedSubstrings", this.d, arrayList);
        atyp.b("primaryText", this.f, arrayList);
        atyp.b("primaryTextMatchedSubstrings", this.g, arrayList);
        atyp.b("secondaryText", this.h, arrayList);
        atyp.b("secondaryTextMatchedSubstrings", this.i, arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.E(parcel, 3, this.c);
        atzr.y(parcel, 4, this.d, false);
        atzr.o(parcel, 5, this.e);
        atzr.v(parcel, 6, this.f, false);
        atzr.y(parcel, 7, this.g, false);
        atzr.v(parcel, 8, this.h, false);
        atzr.y(parcel, 9, this.i, false);
        atzr.c(parcel, a);
    }

    @Override // defpackage.atqs
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
