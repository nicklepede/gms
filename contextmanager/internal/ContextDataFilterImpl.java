package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.atqj;
import defpackage.atqk;
import defpackage.atqm;
import defpackage.atrr;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class ContextDataFilterImpl extends AbstractSafeParcelable implements atqm, atrr {
    public static final Parcelable.Creator CREATOR = new atqj();
    public final ArrayList a;
    public final ArrayList b;
    public final QueryFilterParameters c;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class Inclusion extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new atqk();
        public final int a;
        public final int b;
        public final TimeFilterImpl c;
        public final KeyFilterImpl d;

        public Inclusion(int i, int i2, TimeFilterImpl timeFilterImpl, KeyFilterImpl keyFilterImpl) {
            this.a = i;
            this.b = i2;
            this.c = timeFilterImpl;
            this.d = keyFilterImpl;
        }

        public final boolean a() {
            return this.a != -1;
        }

        public final boolean b() {
            return this.d != null;
        }

        public final boolean c() {
            return this.b != -1;
        }

        public final boolean d() {
            return this.c != null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Inclusion)) {
                return false;
            }
            Inclusion inclusion = (Inclusion) obj;
            return this.a == inclusion.a && this.b == inclusion.b && this.c.equals(inclusion.c) && arwb.b(this.d, inclusion.d);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), this.c, this.d});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int a = arxc.a(parcel);
            arxc.o(parcel, 2, this.a);
            arxc.o(parcel, 3, this.b);
            arxc.t(parcel, 4, this.c, i, false);
            arxc.t(parcel, 5, this.d, i, false);
            arxc.c(parcel, a);
        }
    }

    public ContextDataFilterImpl(ArrayList arrayList, ArrayList arrayList2, QueryFilterParameters queryFilterParameters) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = queryFilterParameters;
    }

    @Override // defpackage.atrr
    public final QueryFilterParameters a() {
        return this.c;
    }

    public final HashSet b() {
        ArrayList arrayList = this.a;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        HashSet hashSet = new HashSet();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            hashSet.add(Integer.valueOf(((Inclusion) arrayList.get(i)).b));
        }
        return hashSet;
    }

    public final boolean c() {
        ArrayList arrayList = this.a;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    public final boolean d() {
        ArrayList arrayList = this.b;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x013f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[LOOP:1: B:17:0x0042->B:27:?, LOOP_END, SYNTHETIC] */
    @Override // defpackage.atqm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(com.google.android.gms.contextmanager.ContextData r22) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.contextmanager.internal.ContextDataFilterImpl.e(com.google.android.gms.contextmanager.ContextData):boolean");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContextDataFilterImpl)) {
            return false;
        }
        ContextDataFilterImpl contextDataFilterImpl = (ContextDataFilterImpl) obj;
        return arwb.b(this.a, contextDataFilterImpl.a) && arwb.b(this.b, contextDataFilterImpl.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("contexts=[");
        ArrayList arrayList = this.a;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                sb.append(((Inclusion) arrayList.get(i)).b);
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ArrayList arrayList = this.a;
        int a = arxc.a(parcel);
        arxc.y(parcel, 2, arrayList, false);
        arxc.x(parcel, 3, this.b, false);
        arxc.t(parcel, 4, this.c, i, false);
        arxc.c(parcel, a);
    }
}
