package com.google.android.gms.mobiledataplan.consent;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cebm;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class ConsentAgreementText extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cebm();
    public SafeHtml a;
    public SafeHtml[] b;
    public SafeHtml[] c;
    public String d;
    public String e;
    public String f;
    public int g;
    public String h;

    public ConsentAgreementText() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConsentAgreementText) {
            ConsentAgreementText consentAgreementText = (ConsentAgreementText) obj;
            if (arwb.b(this.a, consentAgreementText.a) && Arrays.equals(this.b, consentAgreementText.b) && Arrays.equals(this.c, consentAgreementText.c) && arwb.b(this.d, consentAgreementText.d) && arwb.b(this.e, consentAgreementText.e) && arwb.b(this.f, consentAgreementText.f) && arwb.b(Integer.valueOf(this.g), Integer.valueOf(consentAgreementText.g)) && arwb.b(this.h, consentAgreementText.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(Arrays.hashCode(this.b)), Integer.valueOf(Arrays.hashCode(this.c)), this.d, this.e, this.f, Integer.valueOf(this.g)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("Title", this.a, arrayList);
        arwa.b("DescriptionParagraphs", Arrays.toString(this.b), arrayList);
        arwa.b("AdditionalInfoParagraphs", Arrays.toString(this.c), arrayList);
        arwa.b("PositiveButtonCaption", this.d, arrayList);
        arwa.b("NegativeButtonCaption", this.e, arrayList);
        arwa.b("ContinueButtonCaption", this.f, arrayList);
        arwa.b("Version", Integer.valueOf(this.g), arrayList);
        arwa.b("TextId", this.h, arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.J(parcel, 2, this.b, i);
        arxc.J(parcel, 3, this.c, i);
        arxc.v(parcel, 4, this.d, false);
        arxc.v(parcel, 5, this.e, false);
        arxc.v(parcel, 6, this.f, false);
        arxc.o(parcel, 7, this.g);
        arxc.v(parcel, 8, this.h, false);
        arxc.c(parcel, a);
    }

    public ConsentAgreementText(SafeHtml safeHtml, SafeHtml[] safeHtmlArr, SafeHtml[] safeHtmlArr2, String str, String str2, String str3, int i, String str4) {
        this.a = safeHtml;
        this.b = safeHtmlArr;
        this.c = safeHtmlArr2;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = i;
        this.h = str4;
    }
}
