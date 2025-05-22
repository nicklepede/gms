package com.google.android.gms.mobiledataplan.consent;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cgkt;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class ConsentAgreementText extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cgkt();
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
            if (atyq.b(this.a, consentAgreementText.a) && Arrays.equals(this.b, consentAgreementText.b) && Arrays.equals(this.c, consentAgreementText.c) && atyq.b(this.d, consentAgreementText.d) && atyq.b(this.e, consentAgreementText.e) && atyq.b(this.f, consentAgreementText.f) && atyq.b(Integer.valueOf(this.g), Integer.valueOf(consentAgreementText.g)) && atyq.b(this.h, consentAgreementText.h)) {
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
        atyp.b("Title", this.a, arrayList);
        atyp.b("DescriptionParagraphs", Arrays.toString(this.b), arrayList);
        atyp.b("AdditionalInfoParagraphs", Arrays.toString(this.c), arrayList);
        atyp.b("PositiveButtonCaption", this.d, arrayList);
        atyp.b("NegativeButtonCaption", this.e, arrayList);
        atyp.b("ContinueButtonCaption", this.f, arrayList);
        atyp.b("Version", Integer.valueOf(this.g), arrayList);
        atyp.b("TextId", this.h, arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.J(parcel, 2, this.b, i);
        atzr.J(parcel, 3, this.c, i);
        atzr.v(parcel, 4, this.d, false);
        atzr.v(parcel, 5, this.e, false);
        atzr.v(parcel, 6, this.f, false);
        atzr.o(parcel, 7, this.g);
        atzr.v(parcel, 8, this.h, false);
        atzr.c(parcel, a);
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
