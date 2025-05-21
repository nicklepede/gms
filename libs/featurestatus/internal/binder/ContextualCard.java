package com.google.android.gms.libs.featurestatus.internal.binder;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.bqts;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class ContextualCard extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bqts();
    public final String a;
    public final String b;
    public final Action c;
    public final Button d;
    public final ProgressBar e;
    public final int f;

    public ContextualCard(String str, String str2, Action action, Button button, ProgressBar progressBar, int i) {
        fvbo.f(str, "title");
        fvbo.f(str2, "description");
        this.a = str;
        this.b = str2;
        this.c = action;
        this.d = button;
        this.e = progressBar;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContextualCard)) {
            return false;
        }
        ContextualCard contextualCard = (ContextualCard) obj;
        return fvbo.n(this.a, contextualCard.a) && fvbo.n(this.b, contextualCard.b) && fvbo.n(this.c, contextualCard.c) && fvbo.n(this.d, contextualCard.d) && fvbo.n(this.e, contextualCard.e) && this.f == contextualCard.f;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        Action action = this.c;
        int hashCode2 = ((hashCode * 31) + (action == null ? 0 : action.hashCode())) * 31;
        Button button = this.d;
        int hashCode3 = (hashCode2 + (button == null ? 0 : button.hashCode())) * 31;
        ProgressBar progressBar = this.e;
        return ((hashCode3 + (progressBar != null ? progressBar.hashCode() : 0)) * 31) + this.f;
    }

    public final String toString() {
        return "ContextualCard(title=" + this.a + ", description=" + this.b + ", action=" + this.c + ", button=" + this.d + ", progressBar=" + this.e + ", stateNumber=" + this.f + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fvbo.f(parcel, "dest");
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.t(parcel, 4, this.d, i, false);
        arxc.t(parcel, 5, this.e, i, false);
        arxc.o(parcel, 6, this.f);
        arxc.c(parcel, a);
    }
}
