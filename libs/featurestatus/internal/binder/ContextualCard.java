package com.google.android.gms.libs.featurestatus.internal.binder;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.btbj;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class ContextualCard extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new btbj();
    public final String a;
    public final String b;
    public final Action c;
    public final Button d;
    public final ProgressBar e;
    public final int f;

    public ContextualCard(String str, String str2, Action action, Button button, ProgressBar progressBar, int i) {
        fxxm.f(str, "title");
        fxxm.f(str2, "description");
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
        return fxxm.n(this.a, contextualCard.a) && fxxm.n(this.b, contextualCard.b) && fxxm.n(this.c, contextualCard.c) && fxxm.n(this.d, contextualCard.d) && fxxm.n(this.e, contextualCard.e) && this.f == contextualCard.f;
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
        fxxm.f(parcel, "dest");
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.t(parcel, 5, this.e, i, false);
        atzr.o(parcel, 6, this.f);
        atzr.c(parcel, a);
    }
}
