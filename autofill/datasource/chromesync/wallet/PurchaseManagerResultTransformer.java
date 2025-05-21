package com.google.android.gms.autofill.datasource.chromesync.wallet;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.autofill.data.DataIntent$ResultTransformer;
import com.google.android.gms.autofill.data.PaymentCard;
import defpackage.adtp;
import defpackage.adts;
import defpackage.adtu;
import defpackage.adtv;
import defpackage.adtw;
import defpackage.aebo;
import defpackage.asej;
import defpackage.asot;
import defpackage.ehiw;
import defpackage.eiid;
import defpackage.ejhf;
import defpackage.faow;
import defpackage.faox;
import defpackage.febw;
import defpackage.fecp;
import defpackage.fedk;
import defpackage.feep;
import j$.time.YearMonth;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class PurchaseManagerResultTransformer implements DataIntent$ResultTransformer {
    final String b;
    final YearMonth c;
    final int d;
    final adtp e;
    final eiid f;
    final eiid g;
    final int h;
    public static final asot a = asot.b("PurchaseManagerResultTransformer", asej.AUTOFILL);
    public static final Parcelable.Creator CREATOR = new aebo();

    public PurchaseManagerResultTransformer(String str, YearMonth yearMonth, adtp adtpVar, int i, int i2, eiid eiidVar, eiid eiidVar2) {
        this.b = str;
        this.c = yearMonth;
        this.e = adtpVar;
        this.d = i;
        this.h = i2;
        this.f = eiidVar;
        this.g = eiidVar2;
    }

    private static YearMonth b(Intent intent) {
        try {
            byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.firstparty.EXPIRATION_DATE");
            if (byteArrayExtra == null) {
                return null;
            }
            fecp y = fecp.y(ehiw.a, byteArrayExtra, 0, byteArrayExtra.length, febw.a());
            fecp.M(y);
            ehiw ehiwVar = (ehiw) y;
            if (ehiwVar != null) {
                return YearMonth.of(ehiwVar.c, ehiwVar.b);
            }
            return null;
        } catch (fedk e) {
            ((ejhf) ((ejhf) ((ejhf) a.j()).s(e)).ah((char) 940)).v();
            return null;
        }
    }

    @Override // com.google.android.gms.autofill.data.DataIntent$ResultTransformer
    public final Object a(int i, Intent intent, eiid eiidVar) {
        YearMonth b;
        YearMonth yearMonth;
        String str;
        String str2;
        String str3;
        int i2;
        String str4;
        YearMonth yearMonth2;
        adts adtsVar = null;
        if (i != -1) {
            return null;
        }
        String stringExtra = intent.getStringExtra("com.google.android.gms.wallet.firstparty.REAL_PAN");
        adts adtsVar2 = !TextUtils.isEmpty(stringExtra) ? new adts(stringExtra) : null;
        if (adtsVar2 == null) {
            return null;
        }
        String stringExtra2 = intent.getStringExtra("com.google.android.gms.wallet.cvnFromServer");
        if (TextUtils.isEmpty(stringExtra2)) {
            byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.SECURE_DATA_RESULT");
            if (byteArrayExtra != null) {
                try {
                    faox faoxVar = faox.a;
                    int length = byteArrayExtra.length;
                    febw febwVar = febw.a;
                    feep feepVar = feep.a;
                    fecp y = fecp.y(faoxVar, byteArrayExtra, 0, length, febw.a);
                    fecp.M(y);
                    Iterator it = ((faox) y).b.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        faow faowVar = (faow) it.next();
                        if (faowVar.c == 1) {
                            String str5 = faowVar.d;
                            if (!TextUtils.isEmpty(str5)) {
                                adtsVar = new adts(str5);
                                break;
                            }
                        }
                    }
                } catch (fedk e) {
                    ((ejhf) ((ejhf) ((ejhf) a.j()).s(e)).ah((char) 939)).v();
                }
            }
        } else {
            adtsVar = new adts(stringExtra2);
        }
        adts adtsVar3 = adtsVar;
        int i3 = this.h;
        if (i3 == 2) {
            b = b(intent);
        } else {
            b = b(intent);
            if (b == null) {
                b = this.c;
            }
        }
        PaymentCard paymentCard = new PaymentCard(adtsVar2, adtsVar3, this.b, b, this.e, this.d);
        if (i3 == 2) {
            eiid eiidVar2 = this.f;
            if (eiidVar2.h() && eiidVar.h()) {
                eiid eiidVar3 = this.g;
                if (eiidVar3.h() && (yearMonth = this.c) != null) {
                    adtw adtwVar = (adtw) eiidVar.c();
                    String str6 = (String) eiidVar2.c();
                    String str7 = (String) eiidVar3.c();
                    adts adtsVar4 = paymentCard.a;
                    adts adtsVar5 = paymentCard.b;
                    String str8 = paymentCard.c;
                    adtu adtuVar = new adtu();
                    adtuVar.d = "";
                    adtuVar.c("");
                    adtuVar.i = 1;
                    adtuVar.a("");
                    adtuVar.f = "";
                    adtuVar.b(0);
                    adtuVar.c(adtsVar4.a);
                    adtuVar.a(adtsVar5 != null ? adtsVar5.a : "");
                    if (str8 == null) {
                        str8 = "";
                    }
                    adtuVar.d = str8;
                    adtuVar.c = paymentCard.d;
                    adtuVar.i = 2;
                    adtuVar.b(paymentCard.f);
                    adtuVar.g = yearMonth;
                    adtuVar.f = str7;
                    if (adtuVar.h != 1 || (str = adtuVar.a) == null || (str2 = adtuVar.b) == null || (str3 = adtuVar.d) == null || (i2 = adtuVar.i) == 0 || (str4 = adtuVar.f) == null || (yearMonth2 = adtuVar.g) == null) {
                        StringBuilder sb = new StringBuilder();
                        if (adtuVar.a == null) {
                            sb.append(" cardNumber");
                        }
                        if (adtuVar.b == null) {
                            sb.append(" CVN");
                        }
                        if (adtuVar.d == null) {
                            sb.append(" cardholderName");
                        }
                        if (adtuVar.i == 0) {
                            sb.append(" cardType");
                        }
                        if (adtuVar.h == 0) {
                            sb.append(" cardNetworkType");
                        }
                        if (adtuVar.f == null) {
                            sb.append(" lastFourOfMaskedCard");
                        }
                        if (adtuVar.g == null) {
                            sb.append(" expirationDateOfMaskedCard");
                        }
                        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                    }
                    adtwVar.a.h(str6, new adtv(str, str2, adtuVar.c, str3, i2, adtuVar.e, str4, yearMonth2));
                }
            }
        }
        return paymentCard;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.b;
        if (str == null) {
            str = "";
        }
        parcel.writeString(str);
        parcel.writeSerializable(this.c);
        parcel.writeByteArray(this.e.r());
        parcel.writeInt(this.d);
        int i2 = this.h;
        if (i2 == 0) {
            throw null;
        }
        parcel.writeInt(i2);
        parcel.writeString((String) this.f.e(""));
        parcel.writeString((String) this.g.e(""));
    }
}
