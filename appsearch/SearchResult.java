package com.google.android.gms.appsearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appsearch.safeparcel.GenericDocumentParcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.udi;
import defpackage.udr;
import defpackage.uef;
import defpackage.ueg;
import j$.util.Objects;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class SearchResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ueg();
    final GenericDocumentParcel a;
    public final List b;
    public final String c;
    public final String d;
    public final double e;
    public final List f;
    public List g;
    private udi h;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public final class MatchInfo extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new udr();
        public final String a;
        final int b;
        final int c;
        final int d;
        final int e;
        final int f;
        final int g;
        private uef h;
        private uef i;
        private uef j;

        public MatchInfo(String str, int i, int i2, int i3, int i4, int i5, int i6) {
            this.a = (String) Objects.requireNonNull(str);
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = i5;
            this.g = i6;
        }

        public final uef a() {
            if (this.h == null) {
                this.h = new uef(this.b, this.c);
            }
            return this.h;
        }

        public final uef b() {
            if (this.j == null) {
                this.j = new uef(this.f, this.g);
            }
            return this.j;
        }

        public final uef c() {
            int i = this.d;
            if (i == -1) {
                throw new UnsupportedOperationException("Submatch is not supported with this backend/Android API level combination");
            }
            if (this.i == null) {
                this.i = new uef(i, this.e);
            }
            return this.i;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            String str = this.a;
            int a = arxc.a(parcel);
            arxc.v(parcel, 1, str, false);
            arxc.o(parcel, 2, this.b);
            arxc.o(parcel, 3, this.c);
            arxc.o(parcel, 4, this.d);
            arxc.o(parcel, 5, this.e);
            arxc.o(parcel, 6, this.f);
            arxc.o(parcel, 7, this.g);
            arxc.c(parcel, a);
        }
    }

    public SearchResult(GenericDocumentParcel genericDocumentParcel, List list, String str, String str2, double d, List list2) {
        this.a = (GenericDocumentParcel) Objects.requireNonNull(genericDocumentParcel);
        this.b = (List) Objects.requireNonNull(list);
        this.c = (String) Objects.requireNonNull(str);
        this.d = (String) Objects.requireNonNull(str2);
        this.e = d;
        this.f = (List) Objects.requireNonNull(list2);
    }

    public final udi a() {
        if (this.h == null) {
            this.h = new udi(this.a);
        }
        return this.h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.y(parcel, 2, this.b, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.j(parcel, 5, this.e);
        arxc.y(parcel, 6, this.f, false);
        arxc.c(parcel, a);
    }
}
