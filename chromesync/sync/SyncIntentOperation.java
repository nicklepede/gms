package com.google.android.gms.chromesync.sync;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.chromesync.sync.SyncIntentOperation;
import defpackage.apem;
import defpackage.apen;
import defpackage.apfc;
import defpackage.apix;
import defpackage.apoa;
import defpackage.appe;
import defpackage.apqb;
import defpackage.apqd;
import defpackage.apqe;
import defpackage.asej;
import defpackage.asnv;
import defpackage.asot;
import defpackage.bmap;
import defpackage.bmat;
import defpackage.eito;
import defpackage.eits;
import defpackage.fuuq;
import defpackage.fuuw;
import defpackage.fuvg;
import defpackage.fvaf;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class SyncIntentOperation extends appe {
    public static final asot a = asot.b("SyncIntentOperation", asej.CHROME_SYNC);
    public static final Uri b = Uri.parse("content://com.google.android.gms.chromesync.sync.ChimeraSyncReceiverService");
    public static final eits c;
    public fuuq d;
    public fuuq e;
    public fuuq f;
    public fuuq g;
    public fuuq h;
    public fuuq i;
    public fuuq j;
    public fuuq k;
    private final fuuw l = new fuvg(new fvaf() { // from class: appp
        @Override // defpackage.fvaf
        public final Object a() {
            fuuq fuuqVar = SyncIntentOperation.this.d;
            if (fuuqVar == null) {
                fvbo.j("accountProviderFactory");
                fuuqVar = null;
            }
            return ((apdo) fuuqVar).a();
        }
    });
    private final fuuw m = new fuvg(new fvaf() { // from class: appq
        @Override // defpackage.fvaf
        public final Object a() {
            fuuq fuuqVar = SyncIntentOperation.this.e;
            if (fuuqVar == null) {
                fvbo.j("syncManagerFactory");
                fuuqVar = null;
            }
            return ((apqc) fuuqVar).b();
        }
    });
    private final fuuw n = new fuvg(new fvaf() { // from class: appr
        @Override // defpackage.fvaf
        public final Object a() {
            fuuq fuuqVar = SyncIntentOperation.this.f;
            if (fuuqVar == null) {
                fvbo.j("metricsLoggerCacheFactory");
                fuuqVar = null;
            }
            return ((apfd) fuuqVar).a();
        }
    });
    private final fuuw o = new fuvg(new fvaf() { // from class: apps
        @Override // defpackage.fvaf
        public final Object a() {
            if (SyncIntentOperation.this.g == null) {
                fvbo.j("clockFactory");
            }
            return asnz.a;
        }
    });
    private final fuuw p = new fuvg(new fvaf() { // from class: appt
        @Override // defpackage.fvaf
        public final Object a() {
            fuuq fuuqVar = SyncIntentOperation.this.h;
            if (fuuqVar == null) {
                fvbo.j("accountAffiliationsUpdaterFactory");
                fuuqVar = null;
            }
            return fuuqVar.a();
        }
    });
    private final fuuw q = new fuvg(new fvaf() { // from class: appu
        @Override // defpackage.fvaf
        public final Object a() {
            fuuq fuuqVar = SyncIntentOperation.this.i;
            if (fuuqVar == null) {
                fvbo.j("accountDataStoreFactory");
                fuuqVar = null;
            }
            return (apix) fuuqVar.a();
        }
    });
    private final fuuw r = new fuvg(new fvaf() { // from class: appv
        @Override // defpackage.fvaf
        public final Object a() {
            fuuq fuuqVar = SyncIntentOperation.this.j;
            if (fuuqVar == null) {
                fvbo.j("syncEntityStoreFactory");
                fuuqVar = null;
            }
            return ((apke) fuuqVar).a();
        }
    });
    private final fuuw s = new fuvg(new fvaf() { // from class: appw
        @Override // defpackage.fvaf
        public final Object a() {
            fuuq fuuqVar = SyncIntentOperation.this.k;
            if (fuuqVar == null) {
                fvbo.j("passwordLocalChromeDataStoreFactory");
                fuuqVar = null;
            }
            return ((apjs) fuuqVar).a();
        }
    });

    static {
        eito eitoVar = new eito();
        eitoVar.i("PASSWORD", apqe.EVENT_GSYNC_PASSWORD_DATA_CHANGED);
        eitoVar.i("AUTOFILL_WALLET", apqe.EVENT_GSYNC_AUTOFILL_WALLET_DATA_CHANGED);
        eitoVar.i("WALLET_METADATA", apqe.EVENT_GSYNC_WALLET_METADATA_CHANGED);
        eitoVar.i("AUTOFILL_WALLET_USAGE", apqe.EVENT_GSYNC_AUTOFILL_WALLET_USAGE_DATA_CHANGED);
        eitoVar.i("AUTOFILL_OFFER", apqe.EVENT_GSYNC_AUTOFILL_OFFER_DATA_CHANGED);
        eitoVar.i("WIFI_CONFIGURATION", apqe.EVENT_GSYNC_WIFI_CONFIGURATION_DATA_CHANGED);
        eitoVar.i("AUTOFILL_PROFILE", apqe.EVENT_GSYNC_AUTOFILL_PROFILE_DATA_CHANGED);
        eitoVar.i("PLUS_ADDRESS", apqe.EVENT_GSYNC_AUTOFILL_SHIELDED_ID_DATA_CHANGED);
        eitoVar.i("PLUS_ADDRESS_SETTING", apqe.EVENT_GSYNC_AUTOFILL_SHIELDED_ID_SETTING_DATA_CHANGED);
        eitoVar.i("NIGORI", apqe.EVENT_GSYNC_METADATA_CHANGED);
        eitoVar.i("PRIORITY_PREFERENCE", apqe.EVENT_GSYNC_PREFERENCE_DATA_CHANGED);
        eitoVar.i("MANAGED_USER_SETTING", apqe.EVENT_GSYNC_MANAGED_USER_SETTING_DATA_CHANGED);
        eitoVar.i("WEBAUTHN_CREDENTIAL", apqe.EVENT_GSYNC_WEBAUTHN_CREDENTIAL_DATA_CHANGED);
        eitoVar.i("INCOMING_PASSWORD_SHARING_INVITATION", apqe.EVENT_GSYNC_INCOMING_PASSWORD_SHARING_INVITATION_DATA_CHANGED);
        c = eitoVar.b();
    }

    public static final Intent b(Context context) {
        Intent startIntent = appe.getStartIntent(context, SyncIntentOperation.class, "com.google.android.gms.chromesync.AFFILIATION_UPDATE_REQUESTED");
        if (startIntent != null) {
            return startIntent;
        }
        throw new apen(apem.f);
    }

    private final apfc d() {
        return (apfc) this.n.a();
    }

    private final apix f() {
        return (apix) this.q.a();
    }

    private final apoa i() {
        return (apoa) this.p.a();
    }

    private final apqb j() {
        return (apqb) this.m.a();
    }

    private final asnv k() {
        return (asnv) this.o.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ee, code lost:
    
        if (r12 == null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void l(android.content.Intent r19, defpackage.fvaf r20) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.chromesync.sync.SyncIntentOperation.l(android.content.Intent, fvaf):void");
    }

    private final void m() {
        Iterator it = c().a().iterator();
        while (it.hasNext()) {
            j().c(apqd.a((bmat) it.next(), apqe.EVENT_GMS_UPDATED, false, null, null));
        }
        i().b();
    }

    private final void n() {
        Iterator it = c().a().iterator();
        while (it.hasNext()) {
            j().c(apqd.a((bmat) it.next(), apqe.EVENT_PHENOTYPE_CHANGED, false, null, null));
        }
    }

    public final bmap c() {
        return (bmap) this.l.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ca A[Catch: unx -> 0x083a, apen -> 0x0847, TryCatch #14 {apen -> 0x0847, unx -> 0x083a, blocks: (B:3:0x0016, B:6:0x001d, B:8:0x0025, B:11:0x0035, B:12:0x003d, B:16:0x0042, B:18:0x004a, B:21:0x004f, B:23:0x0057, B:24:0x0063, B:26:0x0069, B:30:0x007d, B:32:0x0085, B:35:0x008a, B:37:0x0092, B:39:0x0098, B:41:0x009e, B:43:0x00b5, B:45:0x00bd, B:47:0x00c5, B:49:0x00d1, B:51:0x00da, B:52:0x00eb, B:54:0x00f1, B:57:0x010a, B:60:0x0118, B:66:0x011c, B:68:0x0122, B:70:0x012b, B:72:0x013c, B:74:0x0144, B:77:0x01ca, B:79:0x01d2, B:82:0x01da, B:83:0x01e7, B:85:0x01ed, B:87:0x020a, B:89:0x0210, B:90:0x021a, B:92:0x0220, B:93:0x0231, B:95:0x0237, B:100:0x024d, B:102:0x0256, B:107:0x0269, B:109:0x0277, B:111:0x028b, B:113:0x02a1, B:115:0x02ba, B:116:0x02ca, B:122:0x02e2, B:124:0x02e8, B:125:0x0316, B:127:0x031c, B:129:0x032c, B:131:0x0336, B:132:0x0339, B:135:0x0388, B:136:0x03a0, B:138:0x03aa, B:139:0x03b2, B:148:0x03c6, B:151:0x03d5, B:154:0x015b, B:156:0x0163, B:158:0x0179, B:161:0x018f, B:163:0x01ac, B:164:0x03e4, B:167:0x03ee, B:169:0x03f6, B:170:0x0402, B:172:0x0408, B:174:0x041e, B:177:0x0427, B:179:0x042f, B:181:0x0437, B:182:0x0448, B:201:0x04a9, B:202:0x04da, B:204:0x04e0, B:206:0x04f2, B:207:0x0504, B:209:0x050a, B:211:0x0520, B:222:0x057d, B:223:0x057e, B:225:0x0586, B:227:0x0593, B:232:0x05b2, B:234:0x05ba, B:236:0x05c8, B:240:0x05cd, B:242:0x05d5, B:243:0x05e1, B:245:0x05e7, B:246:0x05fc, B:248:0x0602, B:250:0x061a, B:252:0x0620, B:254:0x062f, B:259:0x063f, B:261:0x0647, B:262:0x064d, B:313:0x07e6, B:340:0x07f9, B:341:0x07fa, B:343:0x07fb, B:345:0x0803, B:348:0x0807, B:350:0x080f, B:352:0x082c, B:264:0x064e, B:265:0x0659, B:267:0x065f, B:269:0x0675, B:330:0x06e8, B:282:0x06f0, B:283:0x06f9, B:285:0x06ff, B:287:0x0710, B:318:0x0779, B:300:0x0781, B:301:0x078a, B:303:0x0790, B:305:0x07a1, B:306:0x07b2, B:308:0x07b8, B:310:0x07c6, B:312:0x07d4, B:299:0x0770, B:325:0x07ec, B:326:0x07ef, B:281:0x06df, B:337:0x07f4, B:338:0x07f7, B:289:0x071f, B:290:0x0727, B:293:0x072d, B:294:0x0750, B:316:0x0774, B:297:0x0755, B:322:0x07ea, B:271:0x068e, B:272:0x0696, B:275:0x069c, B:276:0x06bf, B:328:0x06e3, B:279:0x06c4, B:334:0x07f2, B:184:0x0449, B:191:0x0472, B:199:0x04a0, B:200:0x04a8, B:214:0x056d, B:215:0x0575, B:218:0x0577, B:219:0x057a, B:193:0x0481, B:194:0x0485, B:196:0x048b, B:198:0x049d, B:186:0x045c, B:187:0x045f, B:189:0x0465), top: B:2:0x0016, inners: #10, #13, #15 }] */
    @Override // com.google.android.chimera.IntentOperation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onHandleIntent(android.content.Intent r20) {
        /*
            Method dump skipped, instructions count: 2178
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.chromesync.sync.SyncIntentOperation.onHandleIntent(android.content.Intent):void");
    }
}
