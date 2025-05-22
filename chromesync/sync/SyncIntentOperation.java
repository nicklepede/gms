package com.google.android.gms.chromesync.sync;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.chromesync.sync.SyncIntentOperation;
import defpackage.arhd;
import defpackage.arhe;
import defpackage.arht;
import defpackage.arlo;
import defpackage.arqr;
import defpackage.arrv;
import defpackage.arss;
import defpackage.arsu;
import defpackage.arsv;
import defpackage.auid;
import defpackage.aurp;
import defpackage.ausn;
import defpackage.bohh;
import defpackage.bohl;
import defpackage.elgt;
import defpackage.elgx;
import defpackage.fxqo;
import defpackage.fxqu;
import defpackage.fxre;
import defpackage.fxwd;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class SyncIntentOperation extends arrv {
    public static final ausn a = ausn.b("SyncIntentOperation", auid.CHROME_SYNC);
    public static final Uri b = Uri.parse("content://com.google.android.gms.chromesync.sync.ChimeraSyncReceiverService");
    public static final elgx c;
    public fxqo d;
    public fxqo e;
    public fxqo f;
    public fxqo g;
    public fxqo h;
    public fxqo i;
    public fxqo j;
    public fxqo k;
    private final fxqu l = new fxre(new fxwd() { // from class: arsg
        @Override // defpackage.fxwd
        public final Object a() {
            fxqo fxqoVar = SyncIntentOperation.this.d;
            if (fxqoVar == null) {
                fxxm.j("accountProviderFactory");
                fxqoVar = null;
            }
            return ((argf) fxqoVar).a();
        }
    });
    private final fxqu m = new fxre(new fxwd() { // from class: arsh
        @Override // defpackage.fxwd
        public final Object a() {
            fxqo fxqoVar = SyncIntentOperation.this.e;
            if (fxqoVar == null) {
                fxxm.j("syncManagerFactory");
                fxqoVar = null;
            }
            return ((arst) fxqoVar).b();
        }
    });
    private final fxqu n = new fxre(new fxwd() { // from class: arsi
        @Override // defpackage.fxwd
        public final Object a() {
            fxqo fxqoVar = SyncIntentOperation.this.f;
            if (fxqoVar == null) {
                fxxm.j("metricsLoggerCacheFactory");
                fxqoVar = null;
            }
            return ((arhu) fxqoVar).a();
        }
    });
    private final fxqu o = new fxre(new fxwd() { // from class: arsj
        @Override // defpackage.fxwd
        public final Object a() {
            if (SyncIntentOperation.this.g == null) {
                fxxm.j("clockFactory");
            }
            return aurt.a;
        }
    });
    private final fxqu p = new fxre(new fxwd() { // from class: arsk
        @Override // defpackage.fxwd
        public final Object a() {
            fxqo fxqoVar = SyncIntentOperation.this.h;
            if (fxqoVar == null) {
                fxxm.j("accountAffiliationsUpdaterFactory");
                fxqoVar = null;
            }
            return fxqoVar.a();
        }
    });
    private final fxqu q = new fxre(new fxwd() { // from class: arsl
        @Override // defpackage.fxwd
        public final Object a() {
            fxqo fxqoVar = SyncIntentOperation.this.i;
            if (fxqoVar == null) {
                fxxm.j("accountDataStoreFactory");
                fxqoVar = null;
            }
            return (arlo) fxqoVar.a();
        }
    });
    private final fxqu r = new fxre(new fxwd() { // from class: arsm
        @Override // defpackage.fxwd
        public final Object a() {
            fxqo fxqoVar = SyncIntentOperation.this.j;
            if (fxqoVar == null) {
                fxxm.j("syncEntityStoreFactory");
                fxqoVar = null;
            }
            return ((armv) fxqoVar).a();
        }
    });
    private final fxqu s = new fxre(new fxwd() { // from class: arsn
        @Override // defpackage.fxwd
        public final Object a() {
            fxqo fxqoVar = SyncIntentOperation.this.k;
            if (fxqoVar == null) {
                fxxm.j("passwordLocalChromeDataStoreFactory");
                fxqoVar = null;
            }
            return ((armj) fxqoVar).a();
        }
    });

    static {
        elgt elgtVar = new elgt();
        elgtVar.i("PASSWORD", arsv.EVENT_GSYNC_PASSWORD_DATA_CHANGED);
        elgtVar.i("AUTOFILL_WALLET", arsv.EVENT_GSYNC_AUTOFILL_WALLET_DATA_CHANGED);
        elgtVar.i("WALLET_METADATA", arsv.EVENT_GSYNC_WALLET_METADATA_CHANGED);
        elgtVar.i("AUTOFILL_WALLET_USAGE", arsv.EVENT_GSYNC_AUTOFILL_WALLET_USAGE_DATA_CHANGED);
        elgtVar.i("AUTOFILL_OFFER", arsv.EVENT_GSYNC_AUTOFILL_OFFER_DATA_CHANGED);
        elgtVar.i("WIFI_CONFIGURATION", arsv.EVENT_GSYNC_WIFI_CONFIGURATION_DATA_CHANGED);
        elgtVar.i("AUTOFILL_PROFILE", arsv.EVENT_GSYNC_AUTOFILL_PROFILE_DATA_CHANGED);
        elgtVar.i("PLUS_ADDRESS", arsv.EVENT_GSYNC_AUTOFILL_SHIELDED_ID_DATA_CHANGED);
        elgtVar.i("PLUS_ADDRESS_SETTING", arsv.EVENT_GSYNC_AUTOFILL_SHIELDED_ID_SETTING_DATA_CHANGED);
        elgtVar.i("NIGORI", arsv.EVENT_GSYNC_METADATA_CHANGED);
        elgtVar.i("PRIORITY_PREFERENCE", arsv.EVENT_GSYNC_PREFERENCE_DATA_CHANGED);
        elgtVar.i("MANAGED_USER_SETTING", arsv.EVENT_GSYNC_MANAGED_USER_SETTING_DATA_CHANGED);
        elgtVar.i("WEBAUTHN_CREDENTIAL", arsv.EVENT_GSYNC_WEBAUTHN_CREDENTIAL_DATA_CHANGED);
        elgtVar.i("INCOMING_PASSWORD_SHARING_INVITATION", arsv.EVENT_GSYNC_INCOMING_PASSWORD_SHARING_INVITATION_DATA_CHANGED);
        c = elgtVar.b();
    }

    public static final Intent b(Context context) {
        Intent startIntent = arrv.getStartIntent(context, SyncIntentOperation.class, "com.google.android.gms.chromesync.AFFILIATION_UPDATE_REQUESTED");
        if (startIntent != null) {
            return startIntent;
        }
        throw new arhe(arhd.f);
    }

    private final arht d() {
        return (arht) this.n.a();
    }

    private final arlo f() {
        return (arlo) this.q.a();
    }

    private final arqr i() {
        return (arqr) this.p.a();
    }

    private final arss j() {
        return (arss) this.m.a();
    }

    private final aurp k() {
        return (aurp) this.o.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e8, code lost:
    
        if (r12 == null) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void l(android.content.Intent r19, defpackage.fxwd r20) {
        /*
            Method dump skipped, instructions count: 455
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.chromesync.sync.SyncIntentOperation.l(android.content.Intent, fxwd):void");
    }

    private final void m() {
        Iterator it = c().a().iterator();
        while (it.hasNext()) {
            j().c(arsu.a((bohl) it.next(), arsv.EVENT_GMS_UPDATED, false, null, null));
        }
        i().b();
    }

    private final void n() {
        Iterator it = c().a().iterator();
        while (it.hasNext()) {
            j().c(arsu.a((bohl) it.next(), arsv.EVENT_PHENOTYPE_CHANGED, false, null, null));
        }
    }

    public final bohh c() {
        return (bohh) this.l.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0209 A[Catch: wjw -> 0x088f, arhe -> 0x089c, TryCatch #14 {arhe -> 0x089c, wjw -> 0x088f, blocks: (B:3:0x0016, B:6:0x001d, B:8:0x0025, B:11:0x0035, B:12:0x003d, B:16:0x0042, B:18:0x004a, B:21:0x004f, B:23:0x0057, B:24:0x0063, B:26:0x0069, B:30:0x007d, B:32:0x0085, B:35:0x008a, B:37:0x0092, B:39:0x0098, B:41:0x009e, B:43:0x00b5, B:45:0x00bd, B:47:0x00c5, B:49:0x00d1, B:51:0x00da, B:52:0x00eb, B:54:0x00f1, B:57:0x010a, B:60:0x0118, B:66:0x011c, B:68:0x0122, B:70:0x012b, B:72:0x013c, B:75:0x0144, B:77:0x015b, B:80:0x0164, B:82:0x017b, B:84:0x0183, B:87:0x0209, B:89:0x0211, B:92:0x0219, B:93:0x0226, B:95:0x022c, B:97:0x0249, B:99:0x024f, B:100:0x0259, B:102:0x025f, B:103:0x0270, B:105:0x0276, B:110:0x028c, B:112:0x0295, B:117:0x02a8, B:119:0x02b6, B:121:0x02ca, B:123:0x02e0, B:125:0x02f9, B:126:0x0309, B:132:0x0321, B:133:0x034f, B:135:0x0355, B:137:0x0365, B:139:0x036f, B:140:0x0372, B:143:0x03bf, B:145:0x03e1, B:146:0x03e9, B:151:0x03f7, B:153:0x03fd, B:158:0x041b, B:161:0x042a, B:164:0x019a, B:166:0x01a2, B:168:0x01b8, B:171:0x01ce, B:173:0x01eb, B:174:0x0439, B:177:0x0443, B:179:0x044b, B:180:0x0457, B:182:0x045d, B:184:0x0473, B:187:0x047c, B:189:0x0484, B:191:0x048c, B:192:0x049d, B:211:0x04fe, B:212:0x052f, B:214:0x0535, B:216:0x0547, B:217:0x0559, B:219:0x055f, B:221:0x0575, B:232:0x05d2, B:233:0x05d3, B:235:0x05db, B:237:0x05e8, B:242:0x0607, B:244:0x060f, B:246:0x061d, B:250:0x0622, B:252:0x062a, B:253:0x0636, B:255:0x063c, B:256:0x0651, B:258:0x0657, B:260:0x066f, B:262:0x0675, B:264:0x0684, B:269:0x0694, B:271:0x069c, B:272:0x06a2, B:323:0x083b, B:350:0x084e, B:351:0x084f, B:353:0x0850, B:355:0x0858, B:358:0x085c, B:360:0x0864, B:362:0x0881, B:274:0x06a3, B:275:0x06ae, B:277:0x06b4, B:279:0x06ca, B:340:0x073d, B:292:0x0745, B:293:0x074e, B:295:0x0754, B:297:0x0765, B:328:0x07ce, B:310:0x07d6, B:311:0x07df, B:313:0x07e5, B:315:0x07f6, B:316:0x0807, B:318:0x080d, B:320:0x081b, B:322:0x0829, B:309:0x07c5, B:335:0x0841, B:336:0x0844, B:291:0x0734, B:347:0x0849, B:348:0x084c, B:332:0x083f, B:281:0x06e3, B:282:0x06eb, B:285:0x06f1, B:286:0x0714, B:338:0x0738, B:289:0x0719, B:344:0x0847, B:303:0x0782, B:299:0x0774, B:300:0x077c, B:304:0x07a5, B:326:0x07c9, B:307:0x07aa, B:194:0x049e, B:201:0x04c7, B:209:0x04f5, B:210:0x04fd, B:224:0x05c2, B:225:0x05ca, B:228:0x05cc, B:229:0x05cf, B:203:0x04d6, B:204:0x04da, B:206:0x04e0, B:208:0x04f2, B:196:0x04b1, B:197:0x04b4, B:199:0x04ba), top: B:2:0x0016, inners: #7, #8, #15 }] */
    @Override // com.google.android.chimera.IntentOperation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onHandleIntent(android.content.Intent r20) {
        /*
            Method dump skipped, instructions count: 2264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.chromesync.sync.SyncIntentOperation.onHandleIntent(android.content.Intent):void");
    }
}
