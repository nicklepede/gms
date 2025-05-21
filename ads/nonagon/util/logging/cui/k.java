package com.google.android.gms.ads.nonagon.util.logging.cui;

import android.os.Bundle;
import android.text.TextUtils;
import defpackage.tbv;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class k implements Runnable {
    private final n b;
    private Future d;
    private final List a = new ArrayList();
    private int e = 2;
    private o c = o.SCAR_REQUEST_TYPE_UNSPECIFIED;

    public k(n nVar) {
        this.b = nVar;
    }

    public final synchronized void a() {
        if (((Boolean) com.google.android.gms.ads.internal.flag.h.c.d()).booleanValue()) {
            Future future = this.d;
            if (future != null) {
                future.cancel(false);
            }
            List<b> list = this.a;
            for (b bVar : list) {
                int i = this.e;
                if (i != 2) {
                    bVar.g(i);
                }
                if (!TextUtils.isEmpty(null)) {
                    bVar.e();
                }
                if (!TextUtils.isEmpty(null) && !bVar.b()) {
                    bVar.d();
                }
                bVar.f(this.c);
                this.b.b(bVar.c());
            }
            list.clear();
        }
    }

    public final synchronized void b(b bVar) {
        if (((Boolean) com.google.android.gms.ads.internal.flag.h.c.d()).booleanValue()) {
            List list = this.a;
            bVar.l();
            list.add(bVar);
            Future future = this.d;
            if (future != null) {
                future.cancel(false);
            }
            this.d = com.google.android.gms.ads.internal.util.future.e.b.schedule(this, ((Integer) com.google.android.gms.ads.internal.config.p.bm.g()).intValue(), TimeUnit.MILLISECONDS);
        }
    }

    public final synchronized void c(ArrayList arrayList) {
        if (((Boolean) com.google.android.gms.ads.internal.flag.h.c.d()).booleanValue()) {
            if (!arrayList.contains("banner") && !arrayList.contains(tbv.BANNER.name())) {
                if (!arrayList.contains("interstitial") && !arrayList.contains(tbv.INTERSTITIAL.name())) {
                    if (!arrayList.contains("native") && !arrayList.contains(tbv.NATIVE.name())) {
                        if (!arrayList.contains("rewarded") && !arrayList.contains(tbv.REWARDED.name())) {
                            if (arrayList.contains("app_open_ad")) {
                                this.e = 7;
                                return;
                            } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains(tbv.REWARDED_INTERSTITIAL.name())) {
                                this.e = 6;
                                return;
                            }
                        }
                        this.e = 5;
                        return;
                    }
                    this.e = 8;
                    return;
                }
                this.e = 4;
                return;
            }
            this.e = 3;
        }
    }

    public final synchronized void d(Bundle bundle) {
        char c;
        o oVar;
        if (((Boolean) com.google.android.gms.ads.internal.flag.h.c.d()).booleanValue()) {
            Bundle bundle2 = bundle.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
            if (bundle2 != null) {
                bundle = bundle2;
            }
            String string = bundle.getString("query_info_type");
            if (!TextUtils.isEmpty(string)) {
                switch (string.hashCode()) {
                    case 1743582862:
                        if (string.equals("requester_type_0")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1743582863:
                        if (string.equals("requester_type_1")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1743582864:
                        if (string.equals("requester_type_2")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1743582865:
                        if (string.equals("requester_type_3")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1743582866:
                        if (string.equals("requester_type_4")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1743582867:
                        if (string.equals("requester_type_5")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1743582868:
                        if (string.equals("requester_type_6")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1743582869:
                        if (string.equals("requester_type_7")) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1743582870:
                        if (string.equals("requester_type_8")) {
                            c = '\b';
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        oVar = o.SCAR_REQUEST_TYPE_ADMOB;
                        break;
                    case 1:
                        oVar = o.SCAR_REQUEST_TYPE_INBOUND_MEDIATION;
                        break;
                    case 2:
                        oVar = o.SCAR_REQUEST_TYPE_GBID;
                        break;
                    case 3:
                        oVar = o.SCAR_REQUEST_TYPE_GOLDENEYE;
                        break;
                    case 4:
                        oVar = o.SCAR_REQUEST_TYPE_YAVIN;
                        break;
                    case 5:
                        oVar = o.SCAR_REQUEST_TYPE_UNITY;
                        break;
                    case 6:
                        oVar = o.SCAR_REQUEST_TYPE_PAW;
                        break;
                    case 7:
                        oVar = o.SCAR_REQUEST_TYPE_GUILDER;
                        break;
                    case '\b':
                        oVar = o.SCAR_REQUEST_TYPE_GAM_S2S;
                        break;
                    default:
                        oVar = o.SCAR_REQUEST_TYPE_UNSPECIFIED;
                        break;
                }
            } else {
                oVar = o.SCAR_REQUEST_TYPE_UNSPECIFIED;
            }
            this.c = oVar;
        }
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        a();
    }
}
