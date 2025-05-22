package com.google.android.gms.googlehelp.contact.chat;

import android.accounts.Account;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.view.WindowInsets;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity;
import com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.card.MaterialCardView;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.aued;
import defpackage.aupz;
import defpackage.aura;
import defpackage.ausn;
import defpackage.auub;
import defpackage.bcth;
import defpackage.bkud;
import defpackage.bkuf;
import defpackage.bkug;
import defpackage.bkuq;
import defpackage.bkvc;
import defpackage.bkvf;
import defpackage.bkvp;
import defpackage.bkvq;
import defpackage.bkwf;
import defpackage.bkwk;
import defpackage.bkxe;
import defpackage.bkxf;
import defpackage.bkxg;
import defpackage.bkxh;
import defpackage.bkxi;
import defpackage.bkxj;
import defpackage.bkxk;
import defpackage.bkxu;
import defpackage.bkxz;
import defpackage.bkzw;
import defpackage.bkzz;
import defpackage.blag;
import defpackage.blah;
import defpackage.blcb;
import defpackage.blfl;
import defpackage.blfn;
import defpackage.blfz;
import defpackage.blgj;
import defpackage.blgu;
import defpackage.blgv;
import defpackage.blhc;
import defpackage.blhp;
import defpackage.blhq;
import defpackage.blmy;
import defpackage.caqj;
import defpackage.dhpk;
import defpackage.edxt;
import defpackage.ekvi;
import defpackage.eluo;
import defpackage.eqgo;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fgue;
import defpackage.fjva;
import defpackage.frdz;
import defpackage.frem;
import defpackage.frgj;
import defpackage.frgy;
import defpackage.fric;
import defpackage.fril;
import defpackage.frjs;
import defpackage.frkk;
import defpackage.frkn;
import defpackage.frkq;
import defpackage.frkt;
import defpackage.frkw;
import defpackage.imz;
import defpackage.ind;
import defpackage.itr;
import defpackage.iwv;
import defpackage.rxx;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class ChatConversationChimeraActivity extends rxx implements bkud, bkvc {
    public HelpConfig I;
    public blfn J;
    public bcth K;
    public bkuf L;
    BroadcastReceiver M;
    BroadcastReceiver N;
    public aued O;
    public Handler S;
    public Runnable T;
    private View U;
    private View V;
    private View W;
    private View X;
    public AppBarLayout j;
    public ViewStub k;
    public View l;
    public TextView m;
    public ViewStub n;
    public View o;
    public EditText p;
    public ImageButton q;
    public RecyclerView r;
    public bkxu s;
    public String t;
    public long u = -1;
    public boolean v = true;
    public boolean w = false;
    public boolean x = false;
    public long y = 0;
    public boolean z = false;
    public boolean A = false;
    public long B = 0;
    public boolean C = false;
    public boolean D = false;
    public boolean E = false;
    public String F = "";
    public String G = "";
    public String H = "";
    private final eqgo Y = new aupz(Integer.MAX_VALUE, 9);
    private bkvf Z = new bkvf();
    public blhc P = blhc.NO_TEXT_ENTERED;
    public long Q = 0;
    public String R = null;

    public static boolean M(CharSequence charSequence) {
        return TextUtils.getTrimmedLength(charSequence) == 0;
    }

    private final void P() {
        HelpConfig helpConfig = this.I;
        helpConfig.N = "";
        helpConfig.I = "";
    }

    private final void Q(int i) {
        this.V.setVisibility(i);
        this.W.setVisibility(i);
    }

    private final void R() {
        BroadcastReceiver broadcastReceiver = this.M;
        if (broadcastReceiver != null) {
            unregisterReceiver(broadcastReceiver);
            this.M = null;
        }
    }

    private final boolean S() {
        View view = this.X;
        return view != null && view.getVisibility() == 0;
    }

    public static Intent k(Context context, HelpConfig helpConfig) {
        Intent addFlags = new Intent().setClassName(context, "com.google.android.gms.googlehelp.contact.chat.ChatConversationActivity").putExtra("EXTRA_HELP_CONFIG", helpConfig).putExtra("EXTRA_START_TICK", System.nanoTime()).addFlags(67108864);
        addFlags.addFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS);
        return addFlags;
    }

    public final void A() {
        blhc blhcVar = this.P;
        HelpConfig helpConfig = this.I;
        ausn ausnVar = ChatRequestAndConversationChimeraService.a;
        startService(new Intent().setClassName(this, ChatRequestAndConversationChimeraService.b).putExtra("EXTRA_REQUEST_TYPE_UPDATE_USER_TYPING_STATUS", true).putExtra("EXTRA_NEW_TYPING_STATUS", blhcVar.e).putExtra("EXTRA_HELP_CONFIG", helpConfig));
    }

    public final void B(int i) {
        Resources resources = getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.gh_chat_transcript_padding_horizontal);
        this.r.setPadding(dimensionPixelSize, resources.getDimensionPixelSize(R.dimen.gh_chat_transcript_padding_top), dimensionPixelSize, i);
    }

    public final void C(boolean z) {
        this.q.setEnabled(z);
        blag.q(this.q, this, blah.a(this, true != z ? R.attr.gh_disabledIconColor : R.attr.gh_primaryBlueColor));
    }

    public final void D() {
        View view;
        View view2 = this.X;
        if (view2 == null) {
            View inflate = ((ViewStub) findViewById(R.id.gh_chat_request_error_stub)).inflate();
            this.X = inflate;
            bkwk.b(inflate, R.string.gh_chat_request_failed, new View.OnClickListener() { // from class: bkxd
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    ChatConversationChimeraActivity chatConversationChimeraActivity = ChatConversationChimeraActivity.this;
                    chatConversationChimeraActivity.y();
                    ChatRequestAndConversationChimeraService.C(chatConversationChimeraActivity, chatConversationChimeraActivity.I);
                    ChatRequestAndConversationChimeraService.N(true, chatConversationChimeraActivity, chatConversationChimeraActivity.I);
                }
            });
        } else {
            view2.setVisibility(0);
        }
        if (bkzz.a(fril.a.lK().b()) && (view = this.l) != null) {
            view.setVisibility(8);
        }
        m(R.string.gh_chat_request_failed);
    }

    final void E() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.s(true);
        this.r.aj(linearLayoutManager);
        bkxu bkxuVar = new bkxu(this);
        this.s = bkxuVar;
        this.r.ah(bkxuVar);
        if (this.j != null) {
            this.r.z(new bkxk(this));
        }
        View findViewById = findViewById(R.id.gh_chat_send_message_section);
        B(findViewById.getHeight());
        findViewById.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: bkxc
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                int i9 = i4 - i2;
                if (i9 != i8 - i6) {
                    ChatConversationChimeraActivity.this.B(i9);
                }
            }
        });
        if (bkwk.d(this) || bkzz.a(frkk.d())) {
            MaterialCardView materialCardView = (MaterialCardView) findViewById;
            materialCardView.d(0.0f);
            if (bkwk.d(this) || bkwk.e(this)) {
                return;
            }
            materialCardView.lB(getResources().getColor(R.color.gh_surfaceColorElevation2_light_m3_8_percent_opacity));
        }
    }

    final void F() {
        l(new bkxh(this));
    }

    public final void G(boolean z) {
        if (bkzz.b(frgj.c()) && z) {
            this.A = true;
            this.B = System.currentTimeMillis();
            bkxu bkxuVar = this.s;
            bkxuVar.p(bkxuVar.D() - 1);
            bkxuVar.p(bkxuVar.G());
            m(R.string.gh_user_ended_chat);
        } else {
            this.z = true;
            bkxu bkxuVar2 = this.s;
            bkxuVar2.p(bkxuVar2.O(bkxuVar2.f.size() + (-1)) ? bkxuVar2.D() - 1 : bkxuVar2.D() - 2);
            bkxuVar2.p(bkxuVar2.G());
            if (bkzz.b(frgj.c())) {
                m(R.string.gh_agent_has_ended_chat);
            }
        }
        C(false);
        this.p.getText().clear();
        findViewById(R.id.gh_chat_send_message_section).setVisibility(8);
        B(0);
        ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(this.p.getWindowToken(), 0);
        z();
        this.w = false;
        invalidateOptionsMenu();
        if (bkzz.a(frjs.c())) {
            P();
        }
    }

    final void H() {
        this.S.removeCallbacks(this.T);
        this.P = blhc.NO_TEXT_ENTERED;
        A();
    }

    final boolean I() {
        return J() && !this.w;
    }

    public final boolean J() {
        return this.u != -1;
    }

    final boolean K() {
        View view = this.o;
        return view != null && view.getVisibility() == 0;
    }

    final boolean L() {
        View view = this.l;
        return view != null && view.getVisibility() == 0;
    }

    public final boolean N() {
        return M(this.p.getText());
    }

    public final void O(int i) {
        blfz.l(this, this.I, this.J, i);
    }

    @Override // defpackage.bkud
    public final void b(bkuf bkufVar) {
        bkvf bkvfVar = this.Z;
        if (bkvfVar == null) {
            return;
        }
        this.L = bkufVar;
        bkvfVar.b();
        this.Z = null;
    }

    @Override // defpackage.bkvc
    public final bkwf d() {
        throw null;
    }

    @Override // defpackage.bkvc
    public final bkzw e() {
        throw null;
    }

    @Override // defpackage.bkvc
    public final HelpConfig ic() {
        return this.I;
    }

    @Override // defpackage.bkvc
    public final blfn id() {
        return this.J;
    }

    final void l(final bkud bkudVar) {
        bkuf bkufVar = this.L;
        if (bkufVar != null) {
            bkudVar.b(bkufVar);
            return;
        }
        bkvf bkvfVar = this.Z;
        if (bkvfVar != null) {
            bkvfVar.addObserver(new Observer() { // from class: bkxa
                @Override // java.util.Observer
                public final void update(Observable observable, Object obj) {
                    bkudVar.b(ChatConversationChimeraActivity.this.L);
                }
            });
        }
    }

    public final void m(int i) {
        bkwk.a(this.V, i);
    }

    public final void n(String str) {
        View view = this.V;
        int i = bkwk.a;
        view.announceForAccessibility(str);
    }

    public final void o() {
        HelpConfig helpConfig = this.I;
        ausn ausnVar = ChatRequestAndConversationChimeraService.a;
        startService(new Intent().setClassName(this, ChatRequestAndConversationChimeraService.b).putExtra("EXTRA_HELP_CONFIG", helpConfig).putExtra("EXTRA_REQUEST_TYPE_CANCEL_REQUEST_OR_LEAVE_CONVERSATION", true));
    }

    @Override // defpackage.rza, defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            if (i2 == 1) {
                x(true);
                o();
                finish();
                return;
            }
            if (i2 == 2) {
                x(false);
                return;
            }
            ausn ausnVar = blfl.a;
            if (bkzz.b(frgy.d())) {
                fgrc v = blhp.a.v();
                if (!v.b.L()) {
                    v.U();
                }
                fgri fgriVar = v.b;
                blhp blhpVar = (blhp) fgriVar;
                blhpVar.c = 21;
                blhpVar.b |= 1;
                if (!fgriVar.L()) {
                    v.U();
                }
                blhp blhpVar2 = (blhp) v.b;
                blhpVar2.j = 1;
                blhpVar2.b |= 256;
                blhp blhpVar3 = (blhp) v.Q();
                HelpConfig ic = ic();
                fgrc v2 = blhq.a.v();
                if (!v2.b.L()) {
                    v2.U();
                }
                blhq blhqVar = (blhq) v2.b;
                blhpVar3.getClass();
                blhqVar.d = blhpVar3;
                blhqVar.c = 3;
                blfl.J(this, ic, v2);
            }
            blfz.k(this, 36, fjva.CHAT);
        }
    }

    @Override // defpackage.rxx, defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.I.P) {
            int i = edxt.a;
        }
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        HelpConfig e = HelpConfig.e(this, bundle, getIntent());
        if (e == null) {
            throw new IllegalStateException("No HelpConfig provided!");
        }
        this.I = e;
        this.J = new blfn(this);
        this.K = new bcth();
        this.S = new caqj(Looper.getMainLooper());
        this.T = new bkxe(this);
        if (bkzz.a(frkw.c())) {
            bkvq.d(e.Q);
        }
        blah.c(this, e, R.style.gh_ChatConversationLightActivityStyleMaterial3, R.style.gh_ChatConversationDarkActivityStyleMaterial3, R.style.gh_ChatConversationDayNightActivityStyleMaterial3);
        if (e.P) {
            int i = edxt.a;
        }
        setContentView(R.layout.gh_chat_activity_gm3);
        hJ((Toolbar) findViewById(R.id.gh_chat_toolbar));
        bkug.b(this, hO(), false);
        this.j = (AppBarLayout) findViewById(R.id.gh_chat_app_bar);
        this.U = findViewById(R.id.gh_chat_activity);
        this.V = findViewById(R.id.gh_chat_activity_progress_bar);
        this.W = findViewById(R.id.gh_chat_activity_progress_bar_text);
        this.n = (ViewStub) findViewById(R.id.gh_chat_conversation_stub);
        this.k = (ViewStub) findViewById(R.id.gh_chat_queue_status_stub);
        if (auub.g()) {
            iwv.a(getWindow(), false);
            this.j.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: bkwy
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    view.setPadding(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), 0);
                    return windowInsets;
                }
            });
            this.U.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: bkwz
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    view.setPadding(windowInsets.getSystemWindowInsetLeft(), 0, windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                    return windowInsets;
                }
            });
        }
        bkuf.c(this.Y, this, this, this.I);
        this.O = aued.f(this);
        if (bkzz.b(frgj.c())) {
            if (bundle == null) {
                this.F = e.N;
                this.G = e.h();
                this.H = e.I;
            } else {
                String string = bundle.getString("INSTANCE_STATE_CHAT_SUPPORT_REQUEST_ID");
                this.F = string;
                if (TextUtils.isEmpty(string)) {
                    this.F = e.N;
                }
                String string2 = bundle.getString("INSTANCE_STATE_CHAT_POOL_ID");
                this.G = string2;
                if (TextUtils.isEmpty(string2)) {
                    this.G = e.h();
                }
                String string3 = bundle.getString("INSTANCE_STATE_CASE_ID");
                this.H = string3;
                if (TextUtils.isEmpty(string3)) {
                    this.H = e.I;
                }
            }
        }
        if (bundle != null) {
            if (bkzz.a(fric.c())) {
                this.t = bundle.getString("INSTANCE_STATE_LAST_SAVED_MESSAGE_INPUT_TEXT");
            }
            if (bundle.getBoolean("INSTANCE_STATE_IS_CHAT_REQUEST_ERROR_VISIBLE", false)) {
                u();
                D();
            }
        }
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.gh_chat_activity_menu_gm3, menu);
        blag.r(menu.findItem(R.id.gh_chat_activity_menu_share_transcript), this, blah.a(this, R.attr.ghf_greyIconColor));
        blag.r(menu.findItem(R.id.gh_chat_activity_menu_close), this, blah.a(this, R.attr.ghf_greyIconColor));
        return super.onCreateOptionsMenu(menu);
    }

    @Override // defpackage.rxx, defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onDestroy() {
        if (I()) {
            w();
        } else if (this.P != blhc.NO_TEXT_ENTERED) {
            H();
        }
        blfn blfnVar = this.J;
        if (blfnVar != null) {
            blfnVar.close();
        }
        super.onDestroy();
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        Activity activity;
        boolean z;
        int itemId = menuItem.getItemId();
        int i = 1;
        if (itemId == R.id.gh_chat_activity_menu_close) {
            if (I() || S()) {
                blfl.p(this, this.I, 10);
                O(24);
                q();
            } else {
                blcb blcbVar = new blcb();
                blcbVar.a = R.string.gh_end_chat_confirmation_message;
                blcbVar.b = R.string.gh_end_chat_action_text;
                blcbVar.b();
                blcbVar.a().show(getSupportFragmentManager(), "end_chat_dialog");
            }
            return true;
        }
        if (itemId != R.id.gh_chat_activity_menu_share_transcript) {
            if (itemId != 16908332) {
                return super.onOptionsItemSelected(menuItem);
            }
            onBackPressed();
            return true;
        }
        CharSequence q = ChatRequestAndConversationChimeraService.q(getPackageManager(), this.I);
        boolean z2 = false;
        String string = TextUtils.isEmpty(q) ? getString(R.string.gh_chat_google_support) : getString(R.string.gh_hangout_product_specific_subtext, new Object[]{q});
        String string2 = getString(R.string.gh_chat_shared_transcript_email_subject, new Object[]{string});
        Context containerActivity = getContainerActivity();
        itr.h(containerActivity);
        Intent action = new Intent().setAction("android.intent.action.SEND");
        action.putExtra("androidx.core.app.EXTRA_CALLING_PACKAGE", containerActivity.getPackageName());
        action.putExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE", containerActivity.getPackageName());
        action.addFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS);
        while (true) {
            if (!(containerActivity instanceof ContextWrapper)) {
                activity = null;
                break;
            }
            if (containerActivity instanceof Activity) {
                activity = (Activity) containerActivity;
                break;
            }
            containerActivity = ((ContextWrapper) containerActivity).getBaseContext();
        }
        if (activity != null) {
            ComponentName componentName = activity.getComponentName();
            action.putExtra("androidx.core.app.EXTRA_CALLING_ACTIVITY", componentName);
            action.putExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY", componentName);
        }
        imz.c(action);
        bkxu bkxuVar = this.s;
        long j = this.y;
        ArrayList arrayList = new ArrayList(1);
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        String str = "";
        int i2 = 0;
        while (true) {
            List list = bkxuVar.f;
            z = z2;
            if (i2 >= list.size()) {
                break;
            }
            blgu blguVar = (blgu) list.get(i2);
            int i3 = i;
            if (!TextUtils.equals(bkxuVar.m, blguVar.c) && !arrayList.contains(blguVar.c)) {
                arrayList.add(blguVar.c);
                String str2 = blguVar.e;
                Object[] objArr = new Object[2];
                objArr[z ? 1 : 0] = str;
                objArr[i3] = str2;
                sb.append(String.format("%s%s", objArr));
                str = ", ";
            }
            if (i2 == 0 || ((Boolean) bkxuVar.i.get(i2 - 1)).booleanValue()) {
                String str3 = blguVar.e;
                Object obj = bkxuVar.h.get(i2);
                String str4 = blguVar.d;
                Object[] objArr2 = new Object[3];
                objArr2[z ? 1 : 0] = str3;
                objArr2[1] = obj;
                objArr2[2] = str4;
                sb2.append(String.format("\n%s [%s]:\n%s\n", objArr2));
            } else {
                String str5 = blguVar.d;
                Object[] objArr3 = new Object[i3];
                objArr3[z ? 1 : 0] = str5;
                sb2.append(String.format("%s\n", objArr3));
            }
            i2++;
            z2 = z ? 1 : 0;
            i = 1;
        }
        Pair create = Pair.create(sb.toString(), sb2.toString());
        String str6 = (String) create.first;
        String str7 = (String) create.second;
        StringBuilder sb3 = new StringBuilder(string);
        sb3.append("\n---\n");
        String string3 = getString(R.string.gh_chat_shared_transcript_header_time_of_chat);
        long j2 = bkxuVar.j + j;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j2);
        String formatDateTime = DateUtils.formatDateTime(this, calendar.getTimeInMillis(), 21);
        Object[] objArr4 = new Object[2];
        objArr4[z ? 1 : 0] = string3;
        objArr4[1] = formatDateTime;
        sb3.append(String.format("%s: %s\n", objArr4));
        long j3 = bkxuVar.k - bkxuVar.j;
        String string4 = getString(R.string.gh_chat_shared_transcript_header_chat_duration);
        String formatElapsedTime = DateUtils.formatElapsedTime(j3 / 1000);
        Object[] objArr5 = new Object[2];
        objArr5[z ? 1 : 0] = string4;
        objArr5[1] = formatElapsedTime;
        sb3.append(String.format("%s: %s\n", objArr5));
        if (!TextUtils.isEmpty(str6)) {
            Object[] objArr6 = new Object[2];
            objArr6[z ? 1 : 0] = getString(R.string.gh_chat_shared_transcript_header_chatted_with);
            objArr6[1] = str6;
            sb3.append(String.format("%s: %s\n", objArr6));
        }
        sb3.append("---\n");
        sb3.append(str7);
        imz.b(sb3.toString(), action);
        imz.a(string2, action);
        imz.d(action);
        if (aura.ad(this, action)) {
            startActivity(Intent.createChooser(action, getString(R.string.gh_chat_share_transcript)));
        }
        return true;
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onPause() {
        BroadcastReceiver broadcastReceiver;
        bkxz.v(bkxz.a(this, this.I) + this.K.a(), this, this.I);
        ChatRequestAndConversationChimeraService.N(false, this, this.I);
        R();
        if (bkzz.b(frgj.c()) && (broadcastReceiver = this.N) != null) {
            unregisterReceiver(broadcastReceiver);
            this.N = null;
        }
        super.onPause();
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onPrepareOptionsMenu(Menu menu) {
        Activity activity;
        bkxu bkxuVar;
        bkxu bkxuVar2;
        super.onPrepareOptionsMenu(menu);
        boolean z = false;
        menu.findItem(R.id.gh_chat_activity_menu_close).setVisible(!I() || (bkxuVar2 = this.s) == null || bkxuVar2.l <= 0);
        MenuItem findItem = menu.findItem(R.id.gh_chat_activity_menu_share_transcript);
        Context containerActivity = getContainerActivity();
        itr.h(containerActivity);
        Intent action = new Intent().setAction("android.intent.action.SEND");
        action.putExtra("androidx.core.app.EXTRA_CALLING_PACKAGE", containerActivity.getPackageName());
        action.putExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE", containerActivity.getPackageName());
        action.addFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS);
        while (true) {
            if (!(containerActivity instanceof ContextWrapper)) {
                activity = null;
                break;
            }
            if (containerActivity instanceof Activity) {
                activity = (Activity) containerActivity;
                break;
            }
            containerActivity = ((ContextWrapper) containerActivity).getBaseContext();
        }
        if (activity != null) {
            ComponentName componentName = activity.getComponentName();
            action.putExtra("androidx.core.app.EXTRA_CALLING_ACTIVITY", componentName);
            action.putExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY", componentName);
        }
        imz.c(action);
        imz.b("", action);
        imz.a("", action);
        imz.d(action);
        if (I() && (bkxuVar = this.s) != null && bkxuVar.l > 0 && aura.ad(this, action)) {
            z = true;
        }
        findItem.setVisible(z);
        return true;
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onRestart() {
        super.onRestart();
        if (bkzz.a(frkw.c())) {
            bkvq.d(this.I.Q);
        }
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onResume() {
        super.onResume();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity.UPDATE_AGENT_TYPING_STATUS");
        intentFilter.addAction("com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity.UPDATE_CHAT");
        intentFilter.addAction("com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity.MESSAGE_NOT_SENT");
        intentFilter.addAction("com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity.UPDATE_TIMESTAMP_RELATED_OBJECTS");
        intentFilter.addAction("com.google.android.gms.googlehelp.HelpChimeraActivity.CHAT_STATUS_UPDATE");
        intentFilter.addAction("com.google.android.gms.googlehelp.HelpChimeraActivity.CHAT_READY");
        if (this.M == null) {
            this.M = new TracingBroadcastReceiver() { // from class: com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity.5
                @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
                public final void jP(Context context, Intent intent) {
                    String str;
                    bkxu bkxuVar;
                    if (intent.getAction().equals("com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity.UPDATE_AGENT_TYPING_STATUS")) {
                        ChatConversationChimeraActivity chatConversationChimeraActivity = ChatConversationChimeraActivity.this;
                        blhc blhcVar = (blhc) ekvi.i(blhc.b(intent.getIntExtra("EXTRA_NEW_TYPING_STATUS", 0))).e(blhc.UNKNOWN_TYPING_STATUS);
                        if (chatConversationChimeraActivity.s.N(blhcVar, intent.getStringExtra("EXTRA_NEW_TYPING_STATUS_PARTICIPANT_ID"), intent.getLongExtra("EXTRA_NEW_TYPING_STATUS_CLIENT_TIME", -1L)) && blhcVar == blhc.TYPING) {
                            chatConversationChimeraActivity.m(R.string.gh_chat_typing_indicator_active_announcement);
                            return;
                        }
                        return;
                    }
                    if (intent.getAction().equals("com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity.UPDATE_CHAT")) {
                        ChatConversationChimeraActivity.this.F();
                        return;
                    }
                    if (intent.getAction().equals("com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity.MESSAGE_NOT_SENT")) {
                        ChatConversationChimeraActivity chatConversationChimeraActivity2 = ChatConversationChimeraActivity.this;
                        bkxu bkxuVar2 = chatConversationChimeraActivity2.s;
                        long longExtra = intent.getLongExtra("EXTRA_MESSAGE_CLIENT_TIME", -1L);
                        int E = bkxuVar2.E(longExtra);
                        if (E < 0) {
                            ((eluo) bkxu.a.j()).A("No pending messages found for the given client time %d; this means the list is corrupted.", longExtra);
                        } else {
                            List list = bkxuVar2.g;
                            blgv blgvVar = (blgv) list.get(E);
                            fgrc fgrcVar = (fgrc) blgvVar.iQ(5, null);
                            fgrcVar.X(blgvVar);
                            if (!fgrcVar.b.L()) {
                                fgrcVar.U();
                            }
                            blgv blgvVar2 = (blgv) fgrcVar.b;
                            blgv blgvVar3 = blgv.a;
                            blgvVar2.b |= 4;
                            blgvVar2.e = false;
                            list.set(E, (blgv) fgrcVar.Q());
                            bkxuVar2.p(bkxuVar2.F(E));
                        }
                        chatConversationChimeraActivity2.m(R.string.gh_message_failed_to_send_announcement);
                        return;
                    }
                    if (intent.getAction().equals("com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity.UPDATE_TIMESTAMP_RELATED_OBJECTS")) {
                        ChatConversationChimeraActivity chatConversationChimeraActivity3 = ChatConversationChimeraActivity.this;
                        chatConversationChimeraActivity3.y = intent.getLongExtra("EXTRA_DEVICE_SERVER_TIME_DIFFERENCE_ESTIMATE", 0L);
                        chatConversationChimeraActivity3.x = true;
                        if (!intent.getBooleanExtra("EXTRA_SHOULD_UPDATE_TIMESTAMPS", false) || chatConversationChimeraActivity3.v || (bkxuVar = chatConversationChimeraActivity3.s) == null) {
                            return;
                        }
                        List j = bkxz.j(chatConversationChimeraActivity3.L);
                        long j2 = chatConversationChimeraActivity3.y;
                        int size = j == null ? 0 : j.size();
                        int size2 = bkxuVar.h.size();
                        ArrayList arrayList = new ArrayList(size2);
                        int i = 0;
                        for (int i2 = 0; i2 < size; i2++) {
                            if (((blgj) j.get(i2)).c == 3) {
                                fgue fgueVar = ((blgj) j.get(i2)).f;
                                if (fgueVar == null) {
                                    fgueVar = fgue.a;
                                }
                                arrayList.add(bkxuVar.J(fgueVar.b, j2));
                                i++;
                            }
                        }
                        if (i == size2) {
                            bkxuVar.h = arrayList;
                            bkxuVar.o();
                            return;
                        }
                        return;
                    }
                    if (intent.getAction().equals("com.google.android.gms.googlehelp.HelpChimeraActivity.CHAT_READY")) {
                        final ChatConversationChimeraActivity chatConversationChimeraActivity4 = ChatConversationChimeraActivity.this;
                        chatConversationChimeraActivity4.r(chatConversationChimeraActivity4.K.a());
                        chatConversationChimeraActivity4.v = false;
                        chatConversationChimeraActivity4.u();
                        if (chatConversationChimeraActivity4.L()) {
                            chatConversationChimeraActivity4.l.setVisibility(8);
                        }
                        View view = chatConversationChimeraActivity4.o;
                        if (view == null) {
                            chatConversationChimeraActivity4.o = chatConversationChimeraActivity4.n.inflate();
                            chatConversationChimeraActivity4.o.findViewById(R.id.gh_chat_translation_banner_info).setOnClickListener(new View.OnClickListener() { // from class: bkxb
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    ChatConversationChimeraActivity chatConversationChimeraActivity5 = ChatConversationChimeraActivity.this;
                                    edzp edzpVar = new edzp(chatConversationChimeraActivity5);
                                    edzpVar.N(chatConversationChimeraActivity5.getString(R.string.gh_chat_translation_info_title));
                                    edzpVar.C(chatConversationChimeraActivity5.getString(R.string.gh_chat_translation_info_body));
                                    edzpVar.L(chatConversationChimeraActivity5.getString(R.string.common_ok), null);
                                    edzpVar.a();
                                }
                            });
                            chatConversationChimeraActivity4.p = (EditText) chatConversationChimeraActivity4.o.findViewById(R.id.gh_chat_message_input);
                            chatConversationChimeraActivity4.p.addTextChangedListener(new bkxf(chatConversationChimeraActivity4));
                            if (bkzz.a(fric.c()) && (str = chatConversationChimeraActivity4.t) != null) {
                                chatConversationChimeraActivity4.p.setText(str);
                                chatConversationChimeraActivity4.p.requestFocus();
                            }
                            chatConversationChimeraActivity4.q = (ImageButton) chatConversationChimeraActivity4.o.findViewById(R.id.gh_chat_send_message_button);
                            if (bkzz.b(frkn.a.lK().a())) {
                                chatConversationChimeraActivity4.q.setImageResource(2131233182);
                            }
                            chatConversationChimeraActivity4.q.setOnClickListener(new bkxg(chatConversationChimeraActivity4));
                            chatConversationChimeraActivity4.r = (RecyclerView) chatConversationChimeraActivity4.o.findViewById(R.id.gh_chat_transcript);
                            chatConversationChimeraActivity4.E();
                        } else if (view.getVisibility() != 0) {
                            chatConversationChimeraActivity4.o.setVisibility(0);
                            chatConversationChimeraActivity4.E();
                            chatConversationChimeraActivity4.findViewById(R.id.gh_chat_send_message_section).setVisibility(0);
                        }
                        chatConversationChimeraActivity4.F();
                        return;
                    }
                    if (intent.getAction().equals("com.google.android.gms.googlehelp.HelpChimeraActivity.CHAT_STATUS_UPDATE")) {
                        if (intent.getBooleanExtra("EXTRA_IS_CHAT_SUPPORT_STATUS_UPDATE", false)) {
                            ChatConversationChimeraActivity chatConversationChimeraActivity5 = ChatConversationChimeraActivity.this;
                            int intExtra = intent.getIntExtra("EXTRA_CHAT_SUPPORT_QUEUE_POSITION", -1);
                            if (intExtra > 0) {
                                chatConversationChimeraActivity5.v = true;
                                chatConversationChimeraActivity5.u();
                                if (chatConversationChimeraActivity5.K()) {
                                    chatConversationChimeraActivity5.o.setVisibility(8);
                                }
                                View view2 = chatConversationChimeraActivity5.l;
                                if (view2 == null) {
                                    chatConversationChimeraActivity5.l = chatConversationChimeraActivity5.k.inflate();
                                    if (chatConversationChimeraActivity5.m == null) {
                                        chatConversationChimeraActivity5.m = (TextView) chatConversationChimeraActivity5.l.findViewById(R.id.gh_chat_queue_position);
                                    }
                                    blag.q((ImageView) chatConversationChimeraActivity5.l.findViewById(R.id.gh_chat_queue_icon), chatConversationChimeraActivity5, blah.a(chatConversationChimeraActivity5, R.attr.gh_primaryBlueColor));
                                } else if (view2.getVisibility() != 0) {
                                    chatConversationChimeraActivity5.l.setVisibility(0);
                                }
                                String string = chatConversationChimeraActivity5.getString(R.string.gh_chat_queue_position, new Object[]{Integer.valueOf(intExtra)});
                                chatConversationChimeraActivity5.m.setText(string);
                                chatConversationChimeraActivity5.n(string);
                                chatConversationChimeraActivity5.m(R.string.gh_chat_queue_subtext);
                                return;
                            }
                            return;
                        }
                        if (intent.getBooleanExtra("EXTRA_IS_CHAT_SUPPORT_UNAVAILABLE", false)) {
                            ChatConversationChimeraActivity chatConversationChimeraActivity6 = ChatConversationChimeraActivity.this;
                            chatConversationChimeraActivity6.u();
                            chatConversationChimeraActivity6.p();
                            HelpConfig helpConfig = chatConversationChimeraActivity6.I;
                            ausn ausnVar = ChatRequestAndConversationChimeraService.a;
                            chatConversationChimeraActivity6.startService(new Intent().setClassName(chatConversationChimeraActivity6, ChatRequestAndConversationChimeraService.b).putExtra("EXTRA_REQUEST_TYPE_CLEAR_SHOULD_NOTIFY_OF_CHAT_REQUEST_ERROR", true).putExtra("EXTRA_HELP_CONFIG", helpConfig));
                            if (frem.d()) {
                                chatConversationChimeraActivity6.O.m(2014, dhpk.GOOGLEHELP_CHAT_STATUS_UPDATE_NOTIFICATION);
                            } else {
                                chatConversationChimeraActivity6.O.k(2014);
                            }
                            chatConversationChimeraActivity6.D();
                            return;
                        }
                        if (intent.getBooleanExtra("EXTRA_IS_CHAT_DATA_STALE", false)) {
                            ChatConversationChimeraActivity.this.p();
                            return;
                        }
                        if (intent.getBooleanExtra("EXTRA_IS_CHAT_REQUEST_CANCELLED", false)) {
                            ChatConversationChimeraActivity chatConversationChimeraActivity7 = ChatConversationChimeraActivity.this;
                            chatConversationChimeraActivity7.o();
                            chatConversationChimeraActivity7.q();
                        } else if (intent.getBooleanExtra("EXTRA_WAS_CHAT_SUPPORT_ENDED", false)) {
                            ChatConversationChimeraActivity.this.v();
                        } else {
                            intent.getBooleanExtra("EXTRA_NO_PENDING_CHAT_REQUEST", false);
                        }
                    }
                }
            };
        }
        ind.c(this, this.M, intentFilter, "com.google.android.gms.permission.BROADCAST_TO_GOOGLEHELP", null, 2);
        if (bkzz.b(frgj.c())) {
            if (this.N == null) {
                this.N = new TracingBroadcastReceiver() { // from class: com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity.6
                    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
                    public final void jP(Context context, Intent intent) {
                        Account account;
                        if (intent.getAction().equals("com.google.android.gms.googlehelp.HelpChimeraActivity.REQUEST_CHAT_TRANSCRIPT_EMAIL")) {
                            ChatConversationChimeraActivity chatConversationChimeraActivity = ChatConversationChimeraActivity.this;
                            chatConversationChimeraActivity.C = false;
                            if (!intent.getBooleanExtra("EXTRA_REQUEST_CHAT_TRANSCRIPT_EMAIL_SUCCESS", false)) {
                                if (chatConversationChimeraActivity.E) {
                                    chatConversationChimeraActivity.m(R.string.gh_chat_transcript_try_again);
                                }
                                chatConversationChimeraActivity.E = true;
                                chatConversationChimeraActivity.s.L();
                                return;
                            }
                            if (chatConversationChimeraActivity.E && (account = chatConversationChimeraActivity.I.d) != null && !TextUtils.isEmpty(account.name)) {
                                chatConversationChimeraActivity.n(chatConversationChimeraActivity.getString(R.string.gh_chat_transcript_email_sent, new Object[]{account.name}));
                            }
                            chatConversationChimeraActivity.E = false;
                            chatConversationChimeraActivity.D = true;
                            chatConversationChimeraActivity.s.L();
                        }
                    }
                };
            }
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction("com.google.android.gms.googlehelp.HelpChimeraActivity.REQUEST_CHAT_TRANSCRIPT_EMAIL");
            ind.c(this, this.N, intentFilter2, "com.google.android.gms.permission.BROADCAST_TO_GOOGLEHELP", null, 2);
        }
        HelpConfig helpConfig = this.I;
        ausn ausnVar = ChatRequestAndConversationChimeraService.a;
        Intent intent = new Intent();
        String str = ChatRequestAndConversationChimeraService.b;
        startService(intent.setClassName(this, str).putExtra("EXTRA_HELP_CONFIG", helpConfig).putExtra("EXTRA_REQUEST_TYPE_NOTIFY_IF_UPDATING", true));
        ChatRequestAndConversationChimeraService.N(true, this, this.I);
        boolean z = this.x;
        startService(new Intent().setClassName(this, str).putExtra("EXTRA_REQUEST_TYPE_UPDATE_TIMESTAMP_RELATED_OBJECTS", true).putExtra("EXTRA_IS_TIME_DIFFERENCE_ESTIMATE_INITIALIZED", z).putExtra("EXTRA_HELP_CONFIG", this.I));
        if (this.w) {
            ChatRequestAndConversationChimeraService.M(this, this.I);
        }
        this.K.c();
    }

    @Override // defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onSaveInstanceState(Bundle bundle) {
        EditText editText;
        bundle.putParcelable("EXTRA_HELP_CONFIG", this.I);
        if (bkzz.a(fric.c()) && (editText = this.p) != null) {
            bundle.putString("INSTANCE_STATE_LAST_SAVED_MESSAGE_INPUT_TEXT", editText.getText().toString());
        }
        if (S()) {
            bundle.putBoolean("INSTANCE_STATE_IS_CHAT_REQUEST_ERROR_VISIBLE", true);
        }
        if (bkzz.b(frgj.c())) {
            bundle.putString("INSTANCE_STATE_CHAT_SUPPORT_REQUEST_ID", this.F);
            bundle.putString("INSTANCE_STATE_CHAT_POOL_ID", this.G);
            bundle.putString("INSTANCE_STATE_CASE_ID", this.H);
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // defpackage.rxx, defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onStart() {
        super.onStart();
        HelpConfig helpConfig = this.I;
        int i = bkxz.a;
        if (bkuq.d(this, helpConfig, "user_is_requesting_new_chat")) {
            if (K()) {
                w();
            } else if (L()) {
                r(0L);
            }
            y();
            bkxz.p(this, this.I);
        }
    }

    public final void p() {
        l(new bkxi());
    }

    public final void q() {
        v();
        finish();
    }

    public final void r(long j) {
        HelpConfig helpConfig = this.I;
        int i = bkxz.a;
        if (bkuq.d(this, helpConfig, "has_reported_chat_view_time_while_in_queue")) {
            return;
        }
        long a = bkxz.a(this, this.I) + j;
        blfl.F(this, 11, a);
        blfz.p(this, 65, a);
        bkxz.A(this, this.I);
        bkxz.m(this, this.I);
        this.K.c();
    }

    public final void s(boolean z) {
        if (z) {
            H();
            return;
        }
        blhc blhcVar = this.P;
        blhc blhcVar2 = blhc.TYPING;
        if (blhcVar != blhcVar2) {
            this.S.postDelayed(this.T, frdz.h());
            this.P = blhcVar2;
            A();
        }
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        if (intent != null && "android.intent.action.VIEW".equals(intent.getAction()) && intent.getData() != null) {
            if (blmy.s(this, intent, this.I, 2)) {
                return;
            }
            if (new bkvp(this).g(intent.getData(), 1)) {
                return;
            }
        }
        super.startActivity(intent);
    }

    public final void t(String str, String str2, String str3) {
        long currentTimeMillis = System.currentTimeMillis();
        ChatRequestAndConversationChimeraService.K(str, currentTimeMillis, str2, str3, this, this.I);
        blfl.p(this, this.I, 8);
        O(51);
        this.p.getText().clear();
        bkxu bkxuVar = this.s;
        fgrc v = blgu.a.v();
        if (!v.b.L()) {
            v.U();
        }
        blgu blguVar = (blgu) v.b;
        str.getClass();
        blguVar.b |= 2;
        blguVar.d = str;
        blgu blguVar2 = (blgu) v.Q();
        fgrc v2 = blgv.a.v();
        if (!v2.b.L()) {
            v2.U();
        }
        blgv blgvVar = (blgv) v2.b;
        blguVar2.getClass();
        blgvVar.c = blguVar2;
        blgvVar.b |= 1;
        fgue c = fgue.c(currentTimeMillis);
        if (!v2.b.L()) {
            v2.U();
        }
        fgri fgriVar = v2.b;
        blgv blgvVar2 = (blgv) fgriVar;
        c.getClass();
        blgvVar2.d = c;
        blgvVar2.b |= 2;
        if (!fgriVar.L()) {
            v2.U();
        }
        fgri fgriVar2 = v2.b;
        blgv blgvVar3 = (blgv) fgriVar2;
        blgvVar3.b |= 4;
        blgvVar3.e = true;
        if (str2 != null) {
            if (!fgriVar2.L()) {
                v2.U();
            }
            blgv blgvVar4 = (blgv) v2.b;
            blgvVar4.b = 8 | blgvVar4.b;
            blgvVar4.f = str2;
        }
        if (str3 != null) {
            if (!v2.b.L()) {
                v2.U();
            }
            blgv blgvVar5 = (blgv) v2.b;
            blgvVar5.b |= 16;
            blgvVar5.g = str3;
        }
        bkxuVar.g.add((blgv) v2.Q());
        bkxuVar.l++;
        bkxuVar.q((bkxuVar.C() + bkxuVar.D()) - 1);
        bkxuVar.p(bkxuVar.G());
        z();
        m(R.string.gh_sending_message_announcement);
        this.R = null;
    }

    public final void u() {
        View view = this.V;
        if (view == null || view.getVisibility() != 0) {
            return;
        }
        Q(8);
    }

    public final void v() {
        l(new bkxj());
        if (bkzz.a(frjs.c())) {
            P();
        }
        R();
        if (bkzz.a(frkq.c())) {
            bkxz.r(this, this.I);
        }
        if (bkzz.a(frkt.d())) {
            sendBroadcast(new Intent("com.google.android.gms.googlehelp.bestactionmodule.RejoinChatBestActionModule.CHAT_ENDED").setPackage(getPackageName()));
        }
        p();
        if (frem.d()) {
            this.O.m(2014, dhpk.GOOGLEHELP_CHAT_STATUS_UPDATE_NOTIFICATION);
        } else {
            this.O.k(2014);
        }
    }

    final void w() {
        long a = bkxz.a(this, this.I);
        blfl.F(this, 12, a);
        blfz.p(this, 66, a);
    }

    final void x(boolean z) {
        ausn ausnVar = blfl.a;
        if (bkzz.b(frgy.d())) {
            fgrc v = blhp.a.v();
            if (!v.b.L()) {
                v.U();
            }
            fgri fgriVar = v.b;
            blhp blhpVar = (blhp) fgriVar;
            blhpVar.c = 20;
            blhpVar.b |= 1;
            int i = z ? 2 : 3;
            if (!fgriVar.L()) {
                v.U();
            }
            fgri fgriVar2 = v.b;
            blhp blhpVar2 = (blhp) fgriVar2;
            blhpVar2.d = i - 1;
            blhpVar2.b = 2 | blhpVar2.b;
            if (!fgriVar2.L()) {
                v.U();
            }
            blhp blhpVar3 = (blhp) v.b;
            blhpVar3.j = 1;
            blhpVar3.b |= 256;
            blhp blhpVar4 = (blhp) v.Q();
            HelpConfig ic = ic();
            fgrc v2 = blhq.a.v();
            if (!v2.b.L()) {
                v2.U();
            }
            blhq blhqVar = (blhq) v2.b;
            blhpVar4.getClass();
            blhqVar.d = blhpVar4;
            blhqVar.c = 3;
            blfl.J(this, ic, v2);
        }
        blfz.I(this, 35, true != z ? 22 : 21, fjva.CHAT);
    }

    public final void y() {
        if (S()) {
            this.X.setVisibility(8);
        } else if (K()) {
            this.o.setVisibility(8);
        } else if (L()) {
            this.l.setVisibility(8);
        }
        Q(0);
        this.v = true;
        this.w = false;
        this.x = false;
        this.u = -1L;
        bkxz.m(this, this.I);
        bkxz.n(this, this.I);
        this.K.c();
        invalidateOptionsMenu();
    }

    public final void z() {
        this.r.af(this.s.l - 1);
    }

    @Override // defpackage.bkvc
    public final Context a() {
        return this;
    }
}
