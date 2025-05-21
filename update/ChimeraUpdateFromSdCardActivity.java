package com.google.android.gms.update;

import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.R;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.update.phone.layout.view.SystemUpdateSnackbar;
import com.google.android.setupdesign.SetupWizardLayout;
import com.google.android.setupdesign.view.NavigationBar;
import defpackage.asej;
import defpackage.asiu;
import defpackage.asot;
import defpackage.byhr;
import defpackage.ctbd;
import defpackage.dhcf;
import defpackage.dhcg;
import defpackage.dhch;
import defpackage.dhci;
import defpackage.dhcj;
import defpackage.dhck;
import defpackage.dhcl;
import defpackage.dhcr;
import defpackage.dhdd;
import defpackage.dhdz;
import defpackage.ejhf;
import defpackage.iln;
import defpackage.qfp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class ChimeraUpdateFromSdCardActivity extends qfp implements View.OnClickListener {
    public static final asot j = asot.b("CmaUpdateFromSdCardA", asej.OTA);
    private static boolean r = false;
    public String l;
    public View m;
    public Dialog n;
    public boolean o;
    public long p;
    public List q;
    private int s;
    private Handler t;
    public dhdd k = null;
    private final BroadcastReceiver u = new TracingBroadcastReceiver() { // from class: com.google.android.gms.update.ChimeraUpdateFromSdCardActivity.1
        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jz(Context context, Intent intent) {
            ChimeraUpdateFromSdCardActivity chimeraUpdateFromSdCardActivity = ChimeraUpdateFromSdCardActivity.this;
            if (chimeraUpdateFromSdCardActivity.p == 0) {
                chimeraUpdateFromSdCardActivity.f();
            }
        }
    };
    private final BroadcastReceiver v = new TracingBroadcastReceiver() { // from class: com.google.android.gms.update.ChimeraUpdateFromSdCardActivity.2
        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jz(Context context, Intent intent) {
            asot asotVar = ChimeraUpdateFromSdCardActivity.j;
            ChimeraUpdateFromSdCardActivity chimeraUpdateFromSdCardActivity = ChimeraUpdateFromSdCardActivity.this;
            if (chimeraUpdateFromSdCardActivity.o) {
                return;
            }
            chimeraUpdateFromSdCardActivity.b();
        }
    };
    private final ServiceConnection w = new dhcf(this);

    private final void l(int i, int i2) {
        View findViewById = findViewById(i);
        if (findViewById != null) {
            findViewById.setVisibility(i2);
        }
    }

    private final void m() {
        if (this.p > 0) {
            this.p = 0L;
            this.o = false;
        }
        f();
    }

    private final void n() {
        try {
            unregisterReceiver(this.u);
        } catch (IllegalArgumentException unused) {
        }
        try {
            unregisterReceiver(this.v);
        } catch (IllegalArgumentException unused2) {
        }
    }

    private static final boolean o() {
        return ctbd.b().a() > 0;
    }

    private final void p(int i, int i2) {
        q(i, getText(i2));
    }

    private final void q(int i, CharSequence charSequence) {
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return;
        }
        if (findViewById instanceof TextView) {
            ((TextView) findViewById).setText(charSequence);
        }
        findViewById.setEnabled(true);
    }

    public final String a() {
        if (this.q.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = this.q.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
        }
        return sb.toString();
    }

    public final void b() {
        dhdd dhddVar = this.k;
        if (dhddVar != null) {
            try {
                dhddVar.c();
            } catch (RemoteException unused) {
                ((ejhf) ((ejhf) j.i()).ah((char) 11935)).x("reconnect to Sd card service on clearVerifiedState() failure.");
                c();
            }
        }
        finish();
    }

    public final void c() {
        synchronized (this) {
            if (r) {
                f();
            } else {
                Intent intent = new Intent(new Intent("com.google.android.gms.update.BIND_SDCARD_SERVICE"));
                intent.setPackage("com.google.android.gms");
                boolean d = asiu.a().d(this, intent, this.w, 1);
                r = d;
                if (!d) {
                    ((ejhf) ((ejhf) j.i()).ah(11936)).x("bindService call to ChimeraUpdateFromSdCardService returned false!");
                }
            }
        }
    }

    public final void f() {
        int i;
        try {
            i = this.k.a();
        } catch (RemoteException unused) {
            ((ejhf) ((ejhf) j.i()).ah((char) 11942)).x("reconnect to Sd card service on draw getStatus() failure.");
            c();
            i = -1;
        }
        g(i);
    }

    public final void g(int i) {
        String str;
        l(R.id.status, 8);
        l(R.id.status2, 8);
        l(R.id.size, 8);
        l(R.id.progress, 8);
        l(R.id.action_button, 8);
        l(R.id.action_button_2, 8);
        SystemUpdateSnackbar systemUpdateSnackbar = (SystemUpdateSnackbar) findViewById(R.id.snackbar);
        if (systemUpdateSnackbar != null) {
            systemUpdateSnackbar.setVisibility(8);
        }
        l(R.id.button_qualifier, 8);
        p(R.id.title, R.string.system_update_from_sd_card_button_and_title);
        this.s = i;
        if (i == -1) {
            p(R.id.description, R.string.system_update_from_sd_card_unknown_status);
            p(R.id.action_button, R.string.common_cancel);
            l(R.id.action_button, 0);
            return;
        }
        if (i == 1) {
            new ArrayList();
            try {
                List b = this.k.b(a());
                if (this.n == null) {
                    Dialog dialog = new Dialog(this);
                    this.n = dialog;
                    dialog.setContentView(R.layout.system_update_file_browser);
                    this.n.setTitle(R.string.system_update_file_browser_title);
                }
                if (this.q.isEmpty()) {
                    this.n.findViewById(R.id.file_browser_cur_folder).setVisibility(8);
                } else {
                    this.n.findViewById(R.id.file_browser_cur_folder).setVisibility(0);
                    TextView textView = (TextView) this.n.findViewById(R.id.file_browser_cur_folder_text);
                    if (this.q.isEmpty()) {
                        str = null;
                    } else {
                        str = (String) this.q.get(r1.size() - 1);
                    }
                    textView.setText(str);
                    this.n.findViewById(R.id.file_browser_cur_folder).setOnClickListener(new dhcg(this));
                }
                Button button = (Button) this.n.findViewById(R.id.file_browser_ok_button);
                Button button2 = (Button) this.n.findViewById(R.id.file_browser_cancel_button);
                button.setEnabled(false);
                button.setOnClickListener(new dhch(this));
                button2.setOnClickListener(new dhci(this));
                dhcr dhcrVar = new dhcr(getContainerActivity().getLayoutInflater(), b);
                ListView listView = (ListView) this.n.findViewById(R.id.file_browser_list_view);
                listView.setAdapter((ListAdapter) dhcrVar);
                listView.setOnItemClickListener(new dhcj(this, dhcrVar));
                this.n.setOnKeyListener(new dhck(this));
                this.n.show();
                return;
            } catch (RemoteException unused) {
                ((ejhf) ((ejhf) j.i()).ah((char) 11946)).x("reconnect to Sd card service on listFilesInDirectory() failure.");
                c();
                return;
            }
        }
        if (i == 263) {
            p(R.id.description, R.string.system_update_verification_failed_text);
            l(R.id.description, 0);
            p(R.id.action_button, R.string.common_ok);
            l(R.id.action_button, 0);
            return;
        }
        if (i == 1040) {
            p(R.id.description, R.string.system_update_from_sd_card_verified_description);
            l(R.id.description, 0);
            SystemUpdateSnackbar systemUpdateSnackbar2 = (SystemUpdateSnackbar) findViewById(R.id.snackbar);
            if (systemUpdateSnackbar2 != null) {
                systemUpdateSnackbar2.setText(R.string.system_update_low_battery_text);
                systemUpdateSnackbar2.setVisibility(0);
                return;
            }
            return;
        }
        if (i == 3) {
            ProgressBar progressBar = (ProgressBar) findViewById(R.id.progress);
            progressBar.setIndeterminate(true);
            progressBar.setVisibility(0);
            p(R.id.description, R.string.system_update_from_sd_card_verifying_status);
            l(R.id.description, 0);
            findViewById(R.id.action_button).setVisibility(8);
            p(R.id.action_button_2, R.string.common_cancel);
            l(R.id.action_button_2, 0);
            return;
        }
        if (i != 4) {
            return;
        }
        l(R.id.status, 0);
        p(R.id.description, R.string.system_update_from_sd_card_verified_description);
        l(R.id.description, 0);
        p(R.id.action_button, R.string.system_update_restart_now);
        l(R.id.action_button, 0);
        p(R.id.action_button_2, R.string.common_cancel);
        l(R.id.action_button_2, 0);
    }

    public final void h() {
        List list = this.q;
        if (list == null || list.isEmpty()) {
            return;
        }
        this.q.remove(r0.size() - 1);
    }

    public final void k(long j2) {
        long j3 = this.p;
        if (j2 != j3 || j3 == 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j4 = this.p;
        if (currentTimeMillis < j4) {
            int i = ((int) ((j4 - currentTimeMillis) / 1000)) + 1;
            q(R.id.description, getResources().getQuantityString(R.plurals.system_update_countdown_message, i, Integer.valueOf(i)));
            this.t.postDelayed(new dhcl(this, j2), (int) ((this.p - (r2 * ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS)) - currentTimeMillis));
            return;
        }
        if (this.k == null) {
            ((ejhf) ((ejhf) j.i()).ah((char) 11965)).x("Lost connection to the service. Cannot install.");
            return;
        }
        n();
        try {
            this.k.d();
        } catch (RemoteException unused) {
            ((ejhf) ((ejhf) j.i()).ah((char) 11964)).x("reconnect to Sd card service on installUpdate() failure.");
            c();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.s == -1) {
            try {
                this.s = this.k.a();
            } catch (RemoteException unused) {
                ((ejhf) ((ejhf) j.i()).ah((char) 11952)).x("reconnect to Sd card service on click getStatus() failure.");
                c();
            }
        }
        int i = this.s;
        if (i != 4) {
            if (i != 263) {
                b();
                return;
            } else {
                if (view.getId() == R.id.action_button) {
                    b();
                    return;
                }
                return;
            }
        }
        if (view.getId() != R.id.action_button) {
            if (view.getId() == R.id.action_button_2) {
                this.q.clear();
                this.l = null;
                this.m = null;
                this.p = 0L;
                b();
                return;
            }
            return;
        }
        if (this.o) {
            m();
            return;
        }
        if (this.p > 0) {
            return;
        }
        this.o = true;
        asot asotVar = dhdz.a;
        Intent intent = new Intent("android.server.checkin.CHECKIN").setPackage("com.google.android.gms");
        intent.putExtra("force", true);
        intent.putExtra("CheckinService_onStart_checkinReason", 17);
        sendBroadcast(intent);
        this.p = System.currentTimeMillis() + 9999;
        p(R.id.action_button, R.string.system_update_countdown_cancel_button);
        l(R.id.action_button_2, 8);
        k(this.p);
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (o()) {
            Toast makeText = Toast.makeText(this, R.string.system_update_not_owner_text, 1);
            makeText.setGravity(17, makeText.getXOffset(), makeText.getYOffset());
            makeText.show();
            finish();
            return;
        }
        this.q = new ArrayList();
        if (bundle != null) {
            if (bundle.getStringArray("path_array") != null) {
                for (String str : bundle.getStringArray("path_array")) {
                    this.q.add(str);
                }
            }
            if (bundle.getString("last_clicked_item") != null) {
                this.l = bundle.getString("last_clicked_item");
            }
            this.p = bundle.getLong("countdown_end", 0L);
        } else {
            this.p = 0L;
        }
        this.s = -1;
        c();
        this.t = new byhr();
        setContentView(R.layout.system_update_activity_common);
        NavigationBar t = ((SetupWizardLayout) findViewById(R.id.setup_wizard_layout)).t();
        if (t != null) {
            t.setVisibility(8);
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.MEDIA_BAD_REMOVAL");
        intentFilter.addAction("android.intent.action.MEDIA_EJECT");
        intentFilter.addAction("android.intent.action.MEDIA_REMOVED");
        intentFilter.addAction("android.intent.action.MEDIA_SHARED");
        intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
        intentFilter.addDataScheme("file");
        iln.b(this, this.v, intentFilter, 2);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("com.google.android.gms.update.UpdateFromSdCard.STATUS_CHANGED");
        iln.b(this, this.u, intentFilter2, 2);
        findViewById(R.id.action_button).setOnClickListener(this);
        findViewById(R.id.action_button_2).setOnClickListener(this);
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onDestroy() {
        super.onDestroy();
        if (o()) {
            return;
        }
        n();
        if (r) {
            asiu.a().b(this, this.w);
            r = false;
            this.k = null;
        }
        Dialog dialog = this.n;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        try {
        } catch (RemoteException unused) {
            ((ejhf) ((ejhf) j.i()).ah((char) 11956)).x("reconnect to Sd card service on key down getStatus() failure.");
            c();
        }
        if (this.k.a() == 1) {
            if (this.q.isEmpty()) {
                finish();
            } else {
                h();
                f();
            }
            return true;
        }
        b();
        return true;
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onPause() {
        super.onPause();
        if (this.o) {
            return;
        }
        m();
    }

    @Override // defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (!this.q.isEmpty()) {
            String[] strArr = new String[this.q.size()];
            this.q.toArray(strArr);
            bundle.putStringArray("path_array", strArr);
        }
        String str = this.l;
        if (str != null) {
            bundle.putString("last_clicked_item", str);
        }
        bundle.putLong("countdown_end", this.p);
    }
}
