package com.google.android.gms.autofill.data;

import defpackage.adtg;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* renamed from: com.google.android.gms.autofill.data.$AutoValue_MaskedPaymentCardIntentData, reason: invalid class name */
/* loaded from: classes3.dex */
abstract class C$AutoValue_MaskedPaymentCardIntentData extends MaskedPaymentCardIntentData {
    public final long a;
    public final String b;
    public final int c;

    public C$AutoValue_MaskedPaymentCardIntentData(long j, int i, String str) {
        this.a = j;
        this.c = i;
        if (str == null) {
            throw new NullPointerException("Null legacyInstrumentId");
        }
        this.b = str;
    }

    @Override // com.google.android.gms.autofill.data.MaskedPaymentCardIntentData
    public final long a() {
        return this.a;
    }

    @Override // com.google.android.gms.autofill.data.MaskedPaymentCardIntentData
    public final String b() {
        return this.b;
    }

    @Override // com.google.android.gms.autofill.data.MaskedPaymentCardIntentData
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MaskedPaymentCardIntentData) {
            MaskedPaymentCardIntentData maskedPaymentCardIntentData = (MaskedPaymentCardIntentData) obj;
            if (this.a == maskedPaymentCardIntentData.a() && this.c == maskedPaymentCardIntentData.c() && this.b.equals(maskedPaymentCardIntentData.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.c;
        adtg.b(i);
        long j = this.a;
        return ((i ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003)) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "MaskedPaymentCardIntentData{instrumentId=" + this.a + ", cardType=" + adtg.a(this.c) + ", legacyInstrumentId=" + this.b + "}";
    }
}
