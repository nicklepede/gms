package com.google.android.gms.googlehelp.contact.chat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Pair;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.chimera.Service;
import com.google.android.gms.R;
import com.google.android.gms.googlehelp.GcmChimeraBroadcastReceiver;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.atzb;
import defpackage.aued;
import defpackage.auid;
import defpackage.aupz;
import defpackage.ausn;
import defpackage.auub;
import defpackage.bkud;
import defpackage.bkuf;
import defpackage.bkum;
import defpackage.bkuq;
import defpackage.bkvb;
import defpackage.bkvf;
import defpackage.bkvg;
import defpackage.bkwh;
import defpackage.bkwk;
import defpackage.bkwx;
import defpackage.bkxz;
import defpackage.bkyz;
import defpackage.bkzc;
import defpackage.bkzd;
import defpackage.bkze;
import defpackage.bkzz;
import defpackage.blbq;
import defpackage.blfl;
import defpackage.blfn;
import defpackage.blfz;
import defpackage.blgj;
import defpackage.blgu;
import defpackage.blhc;
import defpackage.blhf;
import defpackage.blhg;
import defpackage.bliv;
import defpackage.blmy;
import defpackage.dhbk;
import defpackage.dhlq;
import defpackage.dhpk;
import defpackage.ekvi;
import defpackage.elja;
import defpackage.eluo;
import defpackage.eqgo;
import defpackage.fgue;
import defpackage.fjua;
import defpackage.frem;
import defpackage.frff;
import defpackage.frgj;
import defpackage.frgs;
import defpackage.frhk;
import defpackage.frjj;
import defpackage.frli;
import defpackage.ilm;
import defpackage.ilr;
import defpackage.ilt;
import defpackage.imi;
import defpackage.imy;
import defpackage.ind;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class ChatRequestAndConversationChimeraService extends Service implements bkzc, bkud, bkwh {
    public static final ausn a = ausn.b("gH_ChatReq&ConvoSvc", auid.GOOGLE_HELP);
    public static final String b = "com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationService";
    static final Set c = new HashSet();
    private Long A;
    private BroadcastReceiver B;
    private ilt C;
    aued d;
    public boolean e;
    public HelpConfig f;
    public blfn g;
    public bkuf h;
    public boolean i;
    public bkvf s;
    private eqgo u;
    private boolean w;
    private List z;
    private bkvf v = new bkvf();
    public boolean j = false;
    private boolean x = false;
    public boolean k = false;
    public boolean l = false;
    public boolean m = false;
    private CharSequence y = "";
    public bkyz n = null;
    public long o = -1;
    public long p = -1;
    public long q = -1;
    public long r = 0;
    public boolean t = false;

    public static void C(Context context, HelpConfig helpConfig) {
        D(context, helpConfig, false);
    }

    public static void D(Context context, HelpConfig helpConfig, boolean z) {
        Intent putExtra = new Intent().setClassName(context, b).putExtra("EXTRA_HELP_CONFIG", helpConfig);
        if (z) {
            putExtra.putExtra("EXTRA_IGNORE_CHAT_QUEUE_STATUS", true);
        }
        context.startService(putExtra);
    }

    public static void K(String str, long j, String str2, String str3, Context context, HelpConfig helpConfig) {
        Intent putExtra = new Intent().setClassName(context, b).putExtra("EXTRA_REQUEST_TYPE_SEND_CHAT_CONVERSATION_MESSAGE", true).putExtra("EXTRA_NEW_CHAT_CONVERSATION_MESSAGE_CONTENT", str).putExtra("EXTRA_NEW_CHAT_CONVERSATION_MESSAGE_CLIENT_TIME", j).putExtra("EXTRA_HELP_CONFIG", helpConfig);
        if (bkzz.b(frgs.c())) {
            putExtra.putExtra("EXTRA_NEW_CHAT_CONVERSATION_MESSAGE_SMART_REPLY_PREDICTION_ID", str2).putExtra("EXTRA_NEW_CHAT_CONVERSATION_MESSAGE_SMART_REPLY_ACCEPTED_RECOMMENDATION_ID", str3);
        }
        context.startService(putExtra);
    }

    public static void M(Context context, HelpConfig helpConfig) {
        context.startService(new Intent().setClassName(context, b).putExtra("EXTRA_REQUEST_TYPE_UPDATE_CHAT_CONVERSATION", true).putExtra("EXTRA_HELP_CONFIG", helpConfig));
    }

    public static void N(boolean z, Context context, HelpConfig helpConfig) {
        context.startService(new Intent().setClassName(context, b).putExtra("EXTRA_REQUEST_TYPE_UPDATE_IS_CHAT_IN_FOREGROUND", true).putExtra("EXTRA_IS_CHAT_IN_FOREGROUND", z).putExtra("EXTRA_HELP_CONFIG", helpConfig));
    }

    static final void S() {
        bkzz.a(frjj.a.lK().a());
    }

    private static Pair T() {
        return Pair.create(true, 2);
    }

    private static Pair U() {
        return Pair.create(false, 0);
    }

    private static String V(blgu blguVar) {
        String str = blguVar.d;
        return (!TextUtils.isEmpty(str) || blguVar.f.size() <= 0) ? str : ((fjua) blguVar.f.get(0)).h;
    }

    private static void W() {
        Handler handler;
        Runnable runnable;
        if (bkzz.a(frem.c())) {
            Set<bkzd> set = c;
            for (bkzd bkzdVar : set) {
                if (bkzz.a(frem.c()) && (handler = bkzdVar.f) != null && (runnable = bkzdVar.g) != null) {
                    handler.removeCallbacks(runnable);
                    bkzdVar.f = null;
                    bkzdVar.g = null;
                }
            }
            set.clear();
        }
    }

    private final void X(final Intent intent) {
        if (bkzz.b(frff.a.lK().p())) {
            new bkvb().a().w(p(), new dhlq() { // from class: bkyi
                @Override // defpackage.dhlq
                public final void gC(Object obj) {
                    final ekvi ekviVar = (ekvi) obj;
                    if (ekviVar.h()) {
                        final Intent intent2 = intent;
                        final ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService = ChatRequestAndConversationChimeraService.this;
                        chatRequestAndConversationChimeraService.t(new bkud() { // from class: bkyg
                            @Override // defpackage.bkud
                            public final void b(bkuf bkufVar) {
                                HelpConfig helpConfig = (HelpConfig) ekviVar.c();
                                if (bkxz.e(helpConfig, bkufVar) == -1) {
                                    helpConfig.I = "";
                                    helpConfig.N = "";
                                }
                                Intent intent3 = intent2;
                                ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService2 = ChatRequestAndConversationChimeraService.this;
                                bkxz.C(chatRequestAndConversationChimeraService2, helpConfig);
                                if (TextUtils.isEmpty(helpConfig.I) || TextUtils.isEmpty(helpConfig.N)) {
                                    new bkzq(chatRequestAndConversationChimeraService2, helpConfig, chatRequestAndConversationChimeraService2.g, intent3).executeOnExecutor(chatRequestAndConversationChimeraService2.p(), new Void[0]);
                                    return;
                                }
                                Intent intent4 = new Intent(intent3);
                                intent4.putExtra("EXTRA_HELP_CONFIG", helpConfig);
                                GcmChimeraBroadcastReceiver.startWakefulService(chatRequestAndConversationChimeraService2, intent4);
                            }
                        });
                        chatRequestAndConversationChimeraService.G((HelpConfig) ekviVar.c());
                    }
                }
            });
        }
    }

    private static boolean Y(int i) {
        return i > 0;
    }

    private final boolean Z() {
        HelpConfig helpConfig = this.f;
        if (helpConfig == null) {
            ((eluo) a.j()).x("Got request to update conversation, but no configurations available.");
            return false;
        }
        if (bliv.c(helpConfig) && (TextUtils.isEmpty(this.f.N) || bkxz.h(this.f, this.h) == null)) {
            return false;
        }
        if (Y(a())) {
            E();
            return true;
        }
        t(new bkud() { // from class: bkyt
            @Override // defpackage.bkud
            public final void b(bkuf bkufVar) {
                ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService = ChatRequestAndConversationChimeraService.this;
                new bkzj(bkufVar, chatRequestAndConversationChimeraService, chatRequestAndConversationChimeraService.f, chatRequestAndConversationChimeraService.g).executeOnExecutor(chatRequestAndConversationChimeraService.p(), new Void[0]);
            }
        });
        return true;
    }

    public static long e() {
        return System.currentTimeMillis() - SystemClock.elapsedRealtime();
    }

    public static CharSequence q(PackageManager packageManager, HelpConfig helpConfig) {
        if (packageManager == null) {
            ((eluo) a.j()).x("Trying to get an app package name, but packageManager is null");
            return null;
        }
        if (helpConfig == null) {
            ((eluo) a.j()).x("Trying to get an app package name, but config is null");
            return null;
        }
        try {
            return packageManager.getApplicationLabel(packageManager.getApplicationInfo(helpConfig.b, 0));
        } catch (PackageManager.NameNotFoundException unused) {
            ((eluo) a.i()).B("App product name was not found for %s.", helpConfig.b);
            return null;
        }
    }

    @Override // defpackage.bkzc
    public final void A() {
        int a2;
        if (!this.i || this.f == null || (a2 = a()) < 0) {
            return;
        }
        if (a2 != 0) {
            x(4102, dhpk.GOOGLEHELP_CHAT_STATUS_UPDATE_NOTIFICATION, j());
        }
        J(l().putExtra("EXTRA_IS_CHAT_SUPPORT_STATUS_UPDATE", true).putExtra("EXTRA_CHAT_SUPPORT_QUEUE_POSITION", a2));
    }

    @Override // defpackage.bkzc
    public final void B() {
        Intent putExtra;
        this.i = false;
        if (this.e) {
            J(l().putExtra("EXTRA_WAS_CHAT_SUPPORT_ENDED", true));
        } else {
            bkuf bkufVar = this.h;
            if (bkufVar == null || !bkxz.F(bkufVar)) {
                bkxz.D(this, this.f);
                x(2014, dhpk.GOOGLEHELP_CHAT_STATUS_UPDATE_NOTIFICATION, g());
                putExtra = l().putExtra("EXTRA_IS_CHAT_SUPPORT_UNAVAILABLE", true);
            } else {
                putExtra = l().putExtra("EXTRA_WAS_CHAT_SUPPORT_ENDED", true);
            }
            J(putExtra);
        }
        stopSelf();
    }

    final void E() {
        F(false);
    }

    public final void F(boolean z) {
        atzb.s(this.f);
        long e = bkxz.e(this.f, this.h);
        if (bliv.c(this.f) && e == -1) {
            if (TextUtils.isEmpty(this.f.N)) {
                ((eluo) a.j()).x("Got request to request chat or update queue status, but configurations are missing.");
                return;
            }
            e = -1;
        }
        if (bkzz.a(frem.e()) && TextUtils.isEmpty(this.f.N)) {
            ((eluo) a.j()).x("Got request to request chat or update queue status, but configurations are missing.");
            return;
        }
        bkzd bkzdVar = new bkzd(this, this.f, this.g, this, this.h, z);
        if (bkzz.a(frem.c()) && !bkxz.E(this, this.f)) {
            c.add(bkzdVar);
        }
        t(bkzdVar);
        new bkze(Long.valueOf(e), this, this.f, this.g, bkzdVar).executeOnExecutor(p(), new Void[0]);
    }

    public final void G(HelpConfig helpConfig) {
        bkuf.c(p(), this, this, helpConfig);
    }

    public final void H(final long j) {
        t(new bkud() { // from class: bkys
            @Override // defpackage.bkud
            public final void b(bkuf bkufVar) {
                ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService = ChatRequestAndConversationChimeraService.this;
                chatRequestAndConversationChimeraService.J(chatRequestAndConversationChimeraService.n("com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity.UPDATE_TIMESTAMP_RELATED_OBJECTS").putExtra("EXTRA_DEVICE_SERVER_TIME_DIFFERENCE_ESTIMATE", j));
            }
        });
    }

    public final void I() {
        t(new bkud() { // from class: bkyy
            @Override // defpackage.bkud
            public final void b(bkuf bkufVar) {
                ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService = ChatRequestAndConversationChimeraService.this;
                chatRequestAndConversationChimeraService.J(chatRequestAndConversationChimeraService.n("com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity.UPDATE_TIMESTAMP_RELATED_OBJECTS").putExtra("EXTRA_SHOULD_UPDATE_TIMESTAMPS", true).putExtra("EXTRA_DEVICE_SERVER_TIME_DIFFERENCE_ESTIMATE", bkxz.b(chatRequestAndConversationChimeraService.h)));
            }
        });
    }

    public final void J(Intent intent) {
        sendBroadcast(intent.setPackage(getPackageName()));
    }

    final void L(final String str, final long j, final String str2, final String str3) {
        t(new bkud() { // from class: bkyd
            @Override // defpackage.bkud
            public final void b(bkuf bkufVar) {
                String str4 = str;
                long j2 = j;
                String str5 = str2;
                String str6 = str3;
                ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService = ChatRequestAndConversationChimeraService.this;
                new bkzp(str4, j2, str5, str6, bkufVar, chatRequestAndConversationChimeraService, chatRequestAndConversationChimeraService.f, chatRequestAndConversationChimeraService.g).executeOnExecutor(chatRequestAndConversationChimeraService.p(), new Void[0]);
            }
        });
    }

    public final void O(bkuf bkufVar, boolean z) {
        List k = bkxz.k(this.q, bkufVar);
        ArrayList arrayList = new ArrayList();
        int size = k.size();
        for (int i = 0; i < size; i++) {
            if (((blgj) k.get(i)).c == 3) {
                arrayList.add((blgj) k.get(i));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        x(4102, dhpk.GOOGLEHELP_CHAT_STATUS_UPDATE_NOTIFICATION, h(arrayList, z));
    }

    final boolean P() {
        return a() == 0;
    }

    @Override // defpackage.bkzc
    public final boolean Q() {
        return this.i;
    }

    final void R(int i) {
        blfz.l(this, this.f, this.g, i);
    }

    final int a() {
        atzb.s(this.f);
        HelpConfig helpConfig = this.f;
        bkuf bkufVar = this.h;
        int i = bkxz.a;
        if (bkufVar == null) {
            return -1;
        }
        return bkufVar.e(bkvg.d(helpConfig), -1);
    }

    @Override // defpackage.bkud
    public final synchronized void b(bkuf bkufVar) {
        bkvf bkvfVar = this.v;
        if (bkvfVar == null) {
            return;
        }
        this.h = bkufVar;
        bkvfVar.b();
        this.v = null;
    }

    @Override // defpackage.bkwh
    public final void c(bkum bkumVar) {
        List list = this.z;
        if (list == null) {
            return;
        }
        list.remove(bkumVar);
        if (this.z.isEmpty()) {
            this.z = null;
        }
    }

    final long d() {
        if (this.A == null) {
            this.A = Long.valueOf(System.currentTimeMillis());
        }
        return this.A.longValue();
    }

    @Override // defpackage.bkwh
    public final void f(bkum bkumVar) {
        if (this.z == null) {
            this.z = new ArrayList();
        }
        this.z.add(bkumVar);
    }

    final Notification g() {
        ilt o = o(false, false);
        o.r(s(R.string.gh_chat_request_error_notification, new Object[0]));
        o.z(s(R.string.gh_chat_request_error_notification, new Object[0]));
        o.j(r());
        o.g = k();
        o.B(d());
        return o.b();
    }

    public final Notification h(List list, boolean z) {
        PendingIntent k;
        CharSequence[] charSequenceArr;
        blhf blhfVar;
        long j;
        ilt o = o(true, z);
        int size = list.size();
        imi imiVar = new imi((byte[]) null);
        for (int i = 0; i < size; i++) {
            blgj blgjVar = (blgj) list.get(i);
            if ((blgjVar.b & 4) != 0) {
                fgue fgueVar = blgjVar.g;
                if (fgueVar == null) {
                    fgueVar = fgue.a;
                }
                j = fgueVar.b;
            } else {
                j = -1;
            }
            imiVar.j(V(blgjVar.c == 3 ? (blgu) blgjVar.d : blgu.a), j, (blgjVar.c == 3 ? (blgu) blgjVar.d : blgu.a).e);
        }
        if (this.m) {
            imiVar.j(getResources().getString(R.string.gh_chat_notification_message_failed_to_send_text), System.currentTimeMillis(), getResources().getString(R.string.common_google_play_services_error_dialog_title).toUpperCase());
        }
        o.o(imiVar);
        blgj blgjVar2 = (blgj) elja.p(list);
        blgu blguVar = blgjVar2.c == 3 ? (blgu) blgjVar2.d : blgu.a;
        if (!this.m && this.k) {
            if (auub.a()) {
                if (blguVar != null) {
                    blhfVar = blguVar.g;
                    if (blhfVar == null) {
                        blhfVar = blhf.a;
                    }
                } else {
                    blhfVar = null;
                }
                Intent putExtra = new Intent().setClassName(this, b).putExtra("EXTRA_REQUEST_TYPE_SEND_CHAT_NOTIFICATION_DIRECT_MESSAGE", true).putExtra("EXTRA_NEW_CHAT_CONVERSATION_MESSAGE_CLIENT_TIME", System.currentTimeMillis()).putExtra("EXTRA_HELP_CONFIG", this.f);
                if (blhfVar != null && blhfVar.c.size() > 0) {
                    Bundle bundle = new Bundle(blhfVar.c.size());
                    for (blhg blhgVar : blhfVar.c) {
                        bundle.putString(blhgVar.c, blhgVar.b);
                    }
                    putExtra.putExtra("EXTRA_NOTIFICATION_SMART_REPLY_PREDICTION_ID", blhfVar.b).putExtra("EXTRA_NOTIFICATION_SMART_REPLY_TO_RECOMMENDATION_ID_BUNDLE", bundle);
                }
                S();
                k = PendingIntent.getService(this, 10101, putExtra, 134217728);
            } else {
                k = k();
            }
            PendingIntent pendingIntent = k;
            String string = getResources().getString(R.string.gh_chat_message_input_hint);
            HashSet hashSet = new HashSet();
            Bundle bundle2 = new Bundle();
            if (blguVar != null) {
                blhf blhfVar2 = blguVar.g;
                if (blhfVar2 == null) {
                    blhfVar2 = blhf.a;
                }
                if (blhfVar2.c.size() > 0) {
                    blhf blhfVar3 = blguVar.g;
                    if (blhfVar3 == null) {
                        blhfVar3 = blhf.a;
                    }
                    int size2 = blhfVar3.c.size();
                    charSequenceArr = new CharSequence[size2];
                    for (int i2 = 0; i2 < size2; i2++) {
                        blhf blhfVar4 = blguVar.g;
                        if (blhfVar4 == null) {
                            blhfVar4 = blhf.a;
                        }
                        charSequenceArr[i2] = ((blhg) blhfVar4.c.get(i2)).c;
                    }
                    blhf blhfVar5 = blguVar.g;
                    if (blhfVar5 == null) {
                        blhfVar5 = blhf.a;
                    }
                    blfl.r(blhfVar5.b, 3, this, this.f);
                    blhf blhfVar6 = blguVar.g;
                    if (blhfVar6 == null) {
                        blhfVar6 = blhf.a;
                    }
                    blfz.o(blhfVar6.b, 3, 211, this, this.f, this.g);
                    String string2 = getString(R.string.common_reply);
                    IconCompat o2 = IconCompat.o(null, "", 2131233176);
                    Bundle bundle3 = new Bundle();
                    CharSequence d = ilt.d(string2);
                    imy imyVar = new imy(string, charSequenceArr, bundle2, hashSet);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(imyVar);
                    o.f(ilm.a(o2, d, pendingIntent, !auub.a(), bundle3, arrayList, true));
                }
            }
            charSequenceArr = null;
            String string22 = getString(R.string.common_reply);
            IconCompat o22 = IconCompat.o(null, "", 2131233176);
            Bundle bundle32 = new Bundle();
            CharSequence d2 = ilt.d(string22);
            imy imyVar2 = new imy(string, charSequenceArr, bundle2, hashSet);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(imyVar2);
            o.f(ilm.a(o22, d2, pendingIntent, !auub.a(), bundle32, arrayList2, true));
        }
        String V = V(blguVar);
        o.r(blguVar.e);
        o.z(V);
        o.j(V);
        o.g = k();
        o.B(System.currentTimeMillis());
        return o.b();
    }

    public final Notification i() {
        ilt o = o(true, false);
        String s = s(R.string.gh_chat_ongoing_chat_session, new Object[0]);
        o.r(r());
        o.z(s);
        o.j(s);
        o.g = k();
        o.B(d());
        o.o(new ilr());
        return o.b();
    }

    final Notification j() {
        int a2 = this.f == null ? -1 : a();
        String s = a2 == -1 ? s(R.string.gh_chat_waiting_for_response, new Object[0]) : getString(R.string.gh_chat_queue_position, new Object[]{Integer.valueOf(a2)});
        ilt o = o(true, false);
        o.r(s);
        o.z(s);
        o.j(r());
        o.g = k();
        o.B(System.currentTimeMillis());
        return o.b();
    }

    final PendingIntent k() {
        Intent k;
        if (bkzz.c(this.f.g(), frff.g(), frff.c(), frff.d())) {
            if (!TextUtils.isEmpty(this.f.N) && !TextUtils.isEmpty(this.f.I)) {
                HelpConfig helpConfig = this.f;
                if (helpConfig.U) {
                    k = blmy.b(this, helpConfig, System.nanoTime());
                }
            }
            k = blmy.a(this, this.f, System.nanoTime());
        } else {
            if (bliv.c(this.f)) {
                HelpConfig helpConfig2 = this.f;
                if (!helpConfig2.U) {
                    int i = blmy.a;
                    k = blmy.d(this, helpConfig2, !bliv.c(helpConfig2) ? bliv.b(this, helpConfig2, bkwk.e(this)) : bliv.b(this, helpConfig2, getResources().getBoolean(R.bool.gh_is_system_dark)));
                }
            }
            k = ChatConversationChimeraActivity.k(this, this.f);
        }
        S();
        return PendingIntent.getActivity(this, 10101, k, 134217728);
    }

    final Intent l() {
        return n("com.google.android.gms.googlehelp.HelpChimeraActivity.CHAT_STATUS_UPDATE");
    }

    public final Intent m() {
        return n("com.google.android.gms.googlehelp.HelpChimeraActivity.CHAT_READY");
    }

    public final Intent n(String str) {
        Intent intent = new Intent(str);
        if (bkzz.a(frli.d())) {
            intent.setPackage(getPackageName());
        }
        return intent;
    }

    final ilt o(boolean z, boolean z2) {
        if (this.C == null) {
            ilt iltVar = new ilt(this, "chat_channel_id");
            this.C = iltVar;
            iltVar.A = getColor(R.color.material_blue_grey_500);
            iltVar.n(2131233006);
            if (auub.a()) {
                Bundle bundle = new Bundle();
                bundle.putString("android.substName", r());
                this.C.g(bundle);
            }
        }
        boolean P = P();
        ilt iltVar2 = this.C;
        iltVar2.B = !P ? 1 : 0;
        boolean z3 = (z2 || this.j || (!P && z)) ? false : true;
        iltVar2.m(!z3);
        if (z3) {
            ilt iltVar3 = this.C;
            iltVar3.l = 2;
            iltVar3.s(2);
            iltVar3.y(Settings.System.DEFAULT_NOTIFICATION_URI);
        } else {
            ilt iltVar4 = this.C;
            iltVar4.l = 0;
            if (!z) {
                iltVar4.s(4);
            }
        }
        ilt iltVar5 = this.C;
        Intent putExtra = new Intent().setClassName(this, b).putExtra("EXTRA_HELP_CONFIG", this.f).putExtra("EXTRA_REQUEST_TYPE_NOTIFICATION_DISMISSED", true);
        S();
        iltVar5.k(PendingIntent.getService(this, 10101, putExtra, 134217728));
        this.C.b.clear();
        return this.C;
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        blbq.b(this);
        this.r = e();
        this.B = new TracingBroadcastReceiver() { // from class: com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.1
            @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
            public final void jP(Context context, Intent intent) {
                if (!"android.intent.action.TIME_SET".equals(intent.getAction())) {
                    if ("android.intent.action.TIMEZONE_CHANGED".equals(intent.getAction())) {
                        ChatRequestAndConversationChimeraService.this.w();
                        return;
                    }
                    return;
                }
                final ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService = ChatRequestAndConversationChimeraService.this;
                long j = chatRequestAndConversationChimeraService.r;
                long e = ChatRequestAndConversationChimeraService.e();
                chatRequestAndConversationChimeraService.r = e;
                final long j2 = e - j;
                chatRequestAndConversationChimeraService.t(new bkud() { // from class: bkyn
                    @Override // defpackage.bkud
                    public final void b(bkuf bkufVar) {
                        ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService2 = ChatRequestAndConversationChimeraService.this;
                        bkxz.w(bkxz.b(chatRequestAndConversationChimeraService2.h) + j2, chatRequestAndConversationChimeraService2.h);
                    }
                });
                chatRequestAndConversationChimeraService.w();
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        ind.b(this, this.B, intentFilter, 2);
        this.d = aued.f(this);
        if (Build.VERSION.SDK_INT >= 26) {
            aued auedVar = this.d;
            if (auedVar.c("chat_channel_id") == null) {
                auedVar.p(new NotificationChannel("chat_channel_id", getString(R.string.gh_top_appbar_support_label), 4));
            }
        }
        this.g = new blfn(this);
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        if (this.f != null && ((this.w || !this.i) && this.h != null)) {
            v();
        }
        stopForeground(this.w);
        List list = this.z;
        if (list != null) {
            bkum.b(false, list);
        }
        BroadcastReceiver broadcastReceiver = this.B;
        if (broadcastReceiver != null) {
            unregisterReceiver(broadcastReceiver);
        }
        blfn blfnVar = this.g;
        if (blfnVar != null) {
            blfnVar.close();
        }
        super.onDestroy();
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(final Intent intent, int i, int i2) {
        Pair U;
        ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService;
        String str;
        String str2;
        String str3;
        HelpConfig helpConfig;
        HelpConfig helpConfig2;
        if (intent != null && (helpConfig2 = (HelpConfig) intent.getParcelableExtra("EXTRA_HELP_CONFIG")) != null) {
            if (bliv.c(helpConfig2)) {
                if (this.f == null || (!TextUtils.isEmpty(helpConfig2.I) && helpConfig2.t())) {
                    this.f = helpConfig2;
                }
                HelpConfig helpConfig3 = this.f;
                if (helpConfig3 != null) {
                    helpConfig3.aa = bkuq.b(this, helpConfig3);
                }
            } else {
                this.f = helpConfig2;
            }
        }
        HelpConfig helpConfig4 = this.f;
        if (helpConfig4 == null) {
            X(intent);
            ((eluo) a.j()).x("Attempting to start Chat service, but no configurations provided.");
            return 2;
        }
        if (bliv.c(helpConfig4)) {
            HelpConfig helpConfig5 = this.f;
            if (!helpConfig5.U && (TextUtils.isEmpty(helpConfig5.I) || !this.f.t())) {
                X(intent);
                return 2;
            }
        }
        G(this.f);
        if (intent == null) {
            U = Pair.create(true, 2);
        } else if (intent.getBooleanExtra("EXTRA_REQUEST_TYPE_NOTIFY_IF_UPDATING", false)) {
            if (Y(a())) {
                A();
            } else if (P()) {
                y();
            } else {
                Intent l = l();
                HelpConfig helpConfig6 = this.f;
                int i3 = bkxz.a;
                if (bkuq.d(this, helpConfig6, "should_notify_of_chat_request_error")) {
                    l.putExtra("EXTRA_IS_CHAT_SUPPORT_UNAVAILABLE", true);
                } else {
                    l.putExtra("EXTRA_NO_PENDING_CHAT_REQUEST", true);
                }
                J(l);
            }
            U = T();
        } else if (intent.getBooleanExtra("EXTRA_REQUEST_TYPE_QUEUE_STATUS_UPDATE", false)) {
            if (this.f == null || this.x) {
                dhbk.c(intent);
                U = T();
            } else {
                try {
                    final String stringExtra = intent.getStringExtra("EXTRA_REQUEST_VERSION");
                    if (!TextUtils.isEmpty(stringExtra)) {
                        t(new bkud() { // from class: bkyh
                            @Override // defpackage.bkud
                            public final void b(bkuf bkufVar) {
                                String str4 = stringExtra;
                                ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService2 = ChatRequestAndConversationChimeraService.this;
                                bkxz.u(chatRequestAndConversationChimeraService2.f, chatRequestAndConversationChimeraService2.h, Long.valueOf(str4));
                            }
                        });
                    }
                    bkxz.C(this, this.f);
                    W();
                    E();
                    dhbk.c(intent);
                    U = T();
                } finally {
                }
            }
        } else if (intent.getBooleanExtra("EXTRA_REQUEST_TYPE_CONVERSATION_UPDATE", false)) {
            HelpConfig helpConfig7 = this.f;
            if (helpConfig7 == null) {
                dhbk.c(intent);
                U = T();
            } else {
                try {
                    bkxz.C(this, helpConfig7);
                    W();
                    Z();
                    dhbk.c(intent);
                    U = T();
                } finally {
                }
            }
        } else if (intent.getBooleanExtra("EXTRA_REQUEST_TYPE_UPDATE_AGENT_TYPING_STATUS", false)) {
            HelpConfig helpConfig8 = this.f;
            if (helpConfig8 == null || !this.l) {
                dhbk.c(intent);
                U = T();
            } else {
                try {
                    bkxz.C(this, helpConfig8);
                    W();
                    J(n("com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity.UPDATE_AGENT_TYPING_STATUS").putExtra("EXTRA_NEW_TYPING_STATUS", intent.getIntExtra("EXTRA_NEW_TYPING_STATUS", 0)).putExtra("EXTRA_NEW_TYPING_STATUS_PARTICIPANT_ID", intent.getStringExtra("EXTRA_NEW_TYPING_STATUS_PARTICIPANT_ID")).putExtra("EXTRA_NEW_TYPING_STATUS_CLIENT_TIME", intent.getLongExtra("EXTRA_NEW_TYPING_STATUS_CLIENT_TIME", -1L)));
                    dhbk.c(intent);
                    U = T();
                } finally {
                }
            }
        } else if (intent.getBooleanExtra("EXTRA_REQUEST_TYPE_UPDATE_USER_TYPING_STATUS", false)) {
            if (!intent.hasExtra("EXTRA_NEW_TYPING_STATUS") || this.f == null) {
                ((eluo) a.j()).G("Got request to update user's typing status, but at least one of the following occurred: no typing status provided [%d], or no configurations available [%s].", intent.getIntExtra("EXTRA_NEW_TYPING_STATUS", 0), this.f);
            }
            final blhc blhcVar = (blhc) ekvi.i(blhc.b(intent.getIntExtra("EXTRA_NEW_TYPING_STATUS", 0))).e(blhc.UNKNOWN_TYPING_STATUS);
            t(new bkud() { // from class: bkyu
                @Override // defpackage.bkud
                public final void b(bkuf bkufVar) {
                    ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService2 = ChatRequestAndConversationChimeraService.this;
                    chatRequestAndConversationChimeraService2.p().execute(new bkzt(blhcVar, bkufVar, chatRequestAndConversationChimeraService2, chatRequestAndConversationChimeraService2.f, chatRequestAndConversationChimeraService2.p(), chatRequestAndConversationChimeraService2.g));
                }
            });
            U = T();
        } else if (intent.getBooleanExtra("EXTRA_REQUEST_TYPE_SEND_CHAT_CONVERSATION_MESSAGE", false)) {
            String stringExtra2 = intent.getStringExtra("EXTRA_NEW_CHAT_CONVERSATION_MESSAGE_CONTENT");
            if (stringExtra2 == null || (helpConfig = this.f) == null) {
                ((eluo) a.j()).P("Got request to send a message, but at least one of the following occurred: no message provided [%s] or no configurations available [%s].", stringExtra2, this.f);
                U = U();
            } else if (bliv.c(helpConfig) && bkxz.h(this.f, this.h) == null) {
                ((eluo) a.j()).x("Got request to send a message, but configurations are missing.");
                U = U();
            } else {
                long longExtra = intent.getLongExtra("EXTRA_NEW_CHAT_CONVERSATION_MESSAGE_CLIENT_TIME", 0L);
                if (!intent.hasExtra("EXTRA_NEW_CHAT_CONVERSATION_MESSAGE_CLIENT_TIME")) {
                    ((eluo) a.j()).A("Got request to send a message, but no client time was provided [%d].", longExtra);
                }
                L(stringExtra2, longExtra, intent.getStringExtra("EXTRA_NEW_CHAT_CONVERSATION_MESSAGE_SMART_REPLY_PREDICTION_ID"), intent.getStringExtra("EXTRA_NEW_CHAT_CONVERSATION_MESSAGE_SMART_REPLY_ACCEPTED_RECOMMENDATION_ID"));
                U = T();
            }
        } else if (intent.getBooleanExtra("EXTRA_REQUEST_TYPE_SEND_CHAT_NOTIFICATION_DIRECT_MESSAGE", false)) {
            Bundle resultsFromIntent = RemoteInput.getResultsFromIntent(intent);
            String valueOf = resultsFromIntent != null ? String.valueOf(resultsFromIntent.getCharSequence("textReply")) : null;
            if (valueOf == null || this.f == null) {
                ((eluo) a.j()).P("Got request to send a message, but at least one of the following occurred: no message provided [%s] or no configurations available [%s].", valueOf, this.f);
                U = U();
            } else {
                long longExtra2 = intent.getLongExtra("EXTRA_NEW_CHAT_CONVERSATION_MESSAGE_CLIENT_TIME", 0L);
                if (!intent.hasExtra("EXTRA_NEW_CHAT_CONVERSATION_MESSAGE_CLIENT_TIME")) {
                    ((eluo) a.j()).A("Got request to send a message, but no client time was provided [%d].", longExtra2);
                }
                if (bkzz.b(frgs.c())) {
                    if (intent.hasExtra("EXTRA_NOTIFICATION_SMART_REPLY_PREDICTION_ID") && intent.hasExtra("EXTRA_NOTIFICATION_SMART_REPLY_TO_RECOMMENDATION_ID_BUNDLE")) {
                        String stringExtra3 = intent.getStringExtra("EXTRA_NOTIFICATION_SMART_REPLY_PREDICTION_ID");
                        Bundle bundleExtra = intent.getBundleExtra("EXTRA_NOTIFICATION_SMART_REPLY_TO_RECOMMENDATION_ID_BUNDLE");
                        if (TextUtils.isEmpty(stringExtra3) || !bundleExtra.containsKey(valueOf)) {
                            chatRequestAndConversationChimeraService = this;
                            str2 = stringExtra3;
                            str3 = null;
                        } else {
                            chatRequestAndConversationChimeraService = this;
                            str3 = bundleExtra.getString(valueOf);
                            str2 = stringExtra3;
                        }
                        str = valueOf;
                        chatRequestAndConversationChimeraService.L(str, longExtra2, str2, str3);
                        blfl.p(this, this.f, 8);
                        R(51);
                        if (intent.hasExtra("EXTRA_NOTIFICATION_SMART_REPLY_PREDICTION_ID") || !intent.hasExtra("EXTRA_NOTIFICATION_SMART_REPLY_TO_RECOMMENDATION_ID_BUNDLE")) {
                            ((eluo) a.i()).x("Expected the smart reply prediction id and recommendation id map in the direct reply intent.");
                        } else {
                            String stringExtra4 = intent.getStringExtra("EXTRA_NOTIFICATION_SMART_REPLY_PREDICTION_ID");
                            Bundle bundleExtra2 = intent.getBundleExtra("EXTRA_NOTIFICATION_SMART_REPLY_TO_RECOMMENDATION_ID_BUNDLE");
                            if (!TextUtils.isEmpty(stringExtra4) && bundleExtra2.containsKey(str)) {
                                blfl.q(stringExtra4, bundleExtra2.getString(str), 3, this, this.f);
                                blfz.n(stringExtra4, bundleExtra2.getString(str), 3, 212, this, this.f, this.g);
                            }
                        }
                        U = T();
                    } else {
                        ((eluo) a.i()).x("Expected the smart reply prediction id and recommendation id map in the direct reply intent.");
                    }
                }
                chatRequestAndConversationChimeraService = this;
                str = valueOf;
                str2 = null;
                str3 = null;
                chatRequestAndConversationChimeraService.L(str, longExtra2, str2, str3);
                blfl.p(this, this.f, 8);
                R(51);
                if (intent.hasExtra("EXTRA_NOTIFICATION_SMART_REPLY_PREDICTION_ID")) {
                }
                ((eluo) a.i()).x("Expected the smart reply prediction id and recommendation id map in the direct reply intent.");
                U = T();
            }
        } else if (intent.getBooleanExtra("EXTRA_REQUEST_TYPE_UPDATE_CHAT_CONVERSATION", false)) {
            U = !Z() ? U() : T();
        } else if (intent.getBooleanExtra("EXTRA_REQUEST_TYPE_CANCEL_REQUEST_OR_LEAVE_CONVERSATION", false)) {
            if (this.f == null) {
                ((eluo) a.j()).x("Got request to leave conversation, but no configurations available.");
                U = U();
            } else {
                this.i = false;
                this.w = true;
                int a2 = a();
                if (a2 != -1) {
                    if (Y(a2)) {
                        p().execute(new bkwx(this, this.f, this.g));
                    } else {
                        t(new bkud() { // from class: bkyw
                            @Override // defpackage.bkud
                            public final void b(bkuf bkufVar) {
                                ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService2 = ChatRequestAndConversationChimeraService.this;
                                if (chatRequestAndConversationChimeraService2.f != null) {
                                    chatRequestAndConversationChimeraService2.p().execute(new bkzh(bkufVar, chatRequestAndConversationChimeraService2, chatRequestAndConversationChimeraService2.f, chatRequestAndConversationChimeraService2.g));
                                }
                            }
                        });
                    }
                }
                J(l().putExtra("EXTRA_IS_CHAT_REQUEST_CANCELLED", true));
                stopSelf();
                U = T();
            }
        } else if (intent.getBooleanExtra("EXTRA_REQUEST_TYPE_UPDATE_IS_CHAT_IN_FOREGROUND", false)) {
            boolean booleanExtra = intent.getBooleanExtra("EXTRA_IS_CHAT_IN_FOREGROUND", this.j);
            this.j = booleanExtra;
            if (!booleanExtra) {
                t(new bkud() { // from class: bkye
                    @Override // defpackage.bkud
                    public final void b(bkuf bkufVar) {
                        ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService2 = ChatRequestAndConversationChimeraService.this;
                        if (bliv.c(chatRequestAndConversationChimeraService2.f)) {
                            if (intent.getBooleanExtra("EXTRA_STOP_FOREGROUND_SERVICE", false)) {
                                dhpk dhpkVar = dhpk.GOOGLEHELP_CHAT_STATUS_UPDATE_NOTIFICATION;
                                chatRequestAndConversationChimeraService2.u(4102, dhpkVar);
                                chatRequestAndConversationChimeraService2.u(2014, dhpkVar);
                                chatRequestAndConversationChimeraService2.i = false;
                                chatRequestAndConversationChimeraService2.stopSelf();
                                chatRequestAndConversationChimeraService2.stopForeground(true);
                                return;
                            }
                            return;
                        }
                        List j = bkxz.j(bkufVar);
                        if (j.isEmpty()) {
                            return;
                        }
                        blgj blgjVar = (blgj) j.get(j.size() - 1);
                        if (blgjVar.e == bkxz.d(bkufVar) && blgjVar.c == 6) {
                            chatRequestAndConversationChimeraService2.i = false;
                            chatRequestAndConversationChimeraService2.stopSelf();
                        }
                    }
                });
            } else if (P()) {
                x(4102, dhpk.GOOGLEHELP_CHAT_STATUS_UPDATE_NOTIFICATION, i());
                this.m = false;
            }
            U = T();
        } else if (intent.getBooleanExtra("EXTRA_REQUEST_TYPE_NOTIFICATION_DISMISSED", false)) {
            this.i = false;
            stopSelf();
            U = T();
        } else if (intent.getBooleanExtra("EXTRA_REQUEST_TYPE_UPDATE_LAST_SEEN_EVENT_ID", false)) {
            long longExtra3 = intent.getLongExtra("EXTRA_LAST_SEEN_EVENT_ID", -1L);
            synchronized (this) {
                bkxz.B(this.h, longExtra3);
            }
            U = T();
        } else if (intent.getBooleanExtra("EXTRA_REQUEST_TYPE_UPDATE_TIMESTAMP_RELATED_OBJECTS", false)) {
            if (this.l) {
                boolean booleanExtra2 = intent.getBooleanExtra("EXTRA_IS_TIME_DIFFERENCE_ESTIMATE_INITIALIZED", false);
                bkuf bkufVar = this.h;
                int i4 = bkxz.a;
                boolean z = bkufVar != null && bkufVar.m("time_has_changed", false);
                bkuf bkufVar2 = this.h;
                boolean z2 = bkufVar2 != null && bkufVar2.m("time_difference_estimate_has_changed", false);
                if (z) {
                    bkxz.x(this.h, false);
                }
                if (z2) {
                    bkxz.y(this.h, false);
                }
                if (!booleanExtra2 || z) {
                    I();
                } else if (z2) {
                    H(bkxz.b(this.h));
                }
                U = T();
            } else {
                U = T();
            }
        } else if (intent.getBooleanExtra("EXTRA_REQUEST_TYPE_CLEAR_SHOULD_NOTIFY_OF_CHAT_REQUEST_ERROR", false)) {
            bkxz.q(this, this.f);
            U = T();
        } else if (bkzz.b(frgj.c()) && intent.getBooleanExtra("EXTRA_REQUEST_TYPE_REQUEST_CHAT_TRANSCRIPT_EMAIL", false)) {
            t(new bkud() { // from class: bkyo
                @Override // defpackage.bkud
                public final void b(bkuf bkufVar3) {
                    Intent intent2 = intent;
                    ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService2 = ChatRequestAndConversationChimeraService.this;
                    HelpConfig helpConfig9 = chatRequestAndConversationChimeraService2.f;
                    blfn blfnVar = chatRequestAndConversationChimeraService2.g;
                    String stringExtra5 = intent2.getStringExtra("EXTRA_NOTIFICATION_CHAT_SUPPORT_REQUEST_ID");
                    intent2.getStringExtra("EXTRA_NOTIFICATION_CHAT_POOL_ID");
                    new bkzo(chatRequestAndConversationChimeraService2, helpConfig9, blfnVar, stringExtra5, intent2.getStringExtra("EXTRA_NOTIFICATION_CASE_ID")).executeOnExecutor(chatRequestAndConversationChimeraService2.p(), new Void[0]);
                }
            });
            U = T();
        } else {
            U = U();
        }
        if (((Boolean) U.first).booleanValue()) {
            return ((Integer) U.second).intValue();
        }
        if (TextUtils.isEmpty(this.f.N)) {
            throw new IllegalStateException("Attempting to start a ChatRequestAndConversationChimeraService with no support request ID provided.");
        }
        u(2014, dhpk.GOOGLEHELP_CHAT_STATUS_UPDATE_NOTIFICATION);
        if (!this.k) {
            this.e = false;
            this.i = true;
            this.w = false;
            this.x = false;
            this.l = false;
            this.o = -1L;
            this.p = -1L;
            this.q = -1L;
            this.A = null;
            this.r = e();
            this.C = null;
            this.t = false;
            bkxz.q(this, this.f);
            t(new bkud() { // from class: bkyp
                @Override // defpackage.bkud
                public final void b(bkuf bkufVar3) {
                    ChatRequestAndConversationChimeraService.this.v();
                }
            });
            this.s = new bkvf();
            startForeground(4102, j());
            this.k = true;
            t(new bkud() { // from class: bkyx
                @Override // defpackage.bkud
                public final void b(bkuf bkufVar3) {
                    ChatRequestAndConversationChimeraService.this.F(intent.getBooleanExtra("EXTRA_IGNORE_CHAT_QUEUE_STATUS", false));
                }
            });
        }
        return 2;
    }

    public final eqgo p() {
        if (this.u == null) {
            this.u = new aupz(Integer.MAX_VALUE, 9);
        }
        return this.u;
    }

    final String r() {
        if (TextUtils.isEmpty(this.y)) {
            CharSequence q = q(getPackageManager(), this.f);
            this.y = q;
            if (TextUtils.isEmpty(q)) {
                return getResources().getString(R.string.gh_chat_google_support);
            }
        }
        return s(R.string.gh_hangout_product_specific_subtext, this.y);
    }

    final String s(int i, Object... objArr) {
        return getResources().getString(i, objArr);
    }

    public final synchronized void t(final bkud bkudVar) {
        bkuf bkufVar = this.h;
        if (bkufVar != null) {
            bkudVar.b(bkufVar);
            return;
        }
        bkvf bkvfVar = this.v;
        if (bkvfVar != null) {
            bkvfVar.addObserver(new Observer() { // from class: bkyr
                @Override // java.util.Observer
                public final void update(Observable observable, Object obj) {
                    bkudVar.b(ChatRequestAndConversationChimeraService.this.h);
                }
            });
        }
    }

    public final void u(int i, dhpk dhpkVar) {
        if (frem.d()) {
            this.d.m(i, dhpkVar);
        } else {
            this.d.k(i);
        }
    }

    public final void v() {
        atzb.s(this.f);
        atzb.s(this.h);
        bkxz.l(this, this.f, this.h);
    }

    final void w() {
        if (this.j) {
            I();
        } else if (frhk.a.lK().b()) {
            t(new bkud() { // from class: bkyv
                @Override // defpackage.bkud
                public final void b(bkuf bkufVar) {
                    bkxz.x(ChatRequestAndConversationChimeraService.this.h, true);
                }
            });
        } else {
            bkxz.x(this.h, true);
        }
    }

    public final void x(int i, dhpk dhpkVar, Notification notification) {
        if (frem.d()) {
            this.d.u(i, dhpkVar, notification);
        } else {
            this.d.s(i, notification);
        }
    }

    @Override // defpackage.bkzc
    public final void y() {
        if (this.f == null) {
            return;
        }
        if (this.l) {
            J(m());
        }
        HelpConfig helpConfig = this.f;
        if (helpConfig == null) {
            ((eluo) a.j()).x("Got request to join conversation, but no configurations available.");
        } else if (bliv.c(helpConfig) && TextUtils.isEmpty(this.f.N)) {
            ((eluo) a.j()).x("Got request to join conversation, but configurations are missing.");
        } else if (!this.x) {
            this.x = true;
            blfl.p(this, this.f, 7);
            R(49);
            t(new bkud() { // from class: bkyl
                @Override // defpackage.bkud
                public final void b(bkuf bkufVar) {
                    ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService = ChatRequestAndConversationChimeraService.this;
                    atzb.s(chatRequestAndConversationChimeraService.f);
                    new bkzg(bkufVar, chatRequestAndConversationChimeraService, chatRequestAndConversationChimeraService.f, chatRequestAndConversationChimeraService.g).executeOnExecutor(chatRequestAndConversationChimeraService.p(), new Void[0]);
                }
            });
        }
        HelpConfig helpConfig2 = this.f;
        if (helpConfig2 == null || !bkxz.E(this, helpConfig2)) {
            t(new bkud() { // from class: bkyf
                @Override // defpackage.bkud
                public final void b(bkuf bkufVar) {
                    ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService = ChatRequestAndConversationChimeraService.this;
                    if (chatRequestAndConversationChimeraService.n == null) {
                        chatRequestAndConversationChimeraService.n = new bkyz(chatRequestAndConversationChimeraService.f, chatRequestAndConversationChimeraService);
                    }
                    chatRequestAndConversationChimeraService.n.run();
                }
            });
        }
    }

    @Override // defpackage.bkzc
    public final void z() {
        Intent putExtra;
        this.i = false;
        bkuf bkufVar = this.h;
        if (bkufVar == null || !bkxz.F(bkufVar)) {
            x(2014, dhpk.GOOGLEHELP_CHAT_STATUS_UPDATE_NOTIFICATION, g());
            putExtra = l().putExtra("EXTRA_IS_CHAT_DATA_STALE", true);
        } else {
            putExtra = l().putExtra("EXTRA_WAS_CHAT_SUPPORT_ENDED", true);
        }
        J(putExtra);
        stopSelf();
    }
}
