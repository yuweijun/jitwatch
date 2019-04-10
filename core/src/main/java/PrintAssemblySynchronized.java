public class PrintAssemblySynchronized {

    private int i = 0;

    public static void main(String[] args) {
        PrintAssemblySynchronized example = new PrintAssemblySynchronized();
        synchronized (example) {
            example.i++;
        }
    }

}

/**
 * monitorenter
 *
 * Operation
 *
 * Enter monitor for object
 *
 * Format
 *
 *
 * monitorenter Forms
 *
 * monitorenter = 194 (0xc2)
 *
 * Operand Stack
 *
 * ..., objectref →
 *
 * ...
 *
 * Description
 *
 * The objectref must be of type reference.
 *
 * Each object is associated with a monitor. A monitor is locked if and only if it has an owner. The thread that
 * executes monitorenter attempts to gain ownership of the monitor associated with objectref, as follows:
 *
 * If the entry count of the monitor associated with objectref is zero, the thread enters the monitor and sets its entry
 * count to one. The thread is then the owner of the monitor.
 *
 * If the thread already owns the monitor associated with objectref, it reenters the monitor, incrementing its entry
 * count.
 *
 * If another thread already owns the monitor associated with objectref, the thread blocks until the monitor's entry
 * count is zero, then tries again to gain ownership.
 *
 * Run-time Exception
 *
 * If objectref is null, monitorenter throws a NullPointerException.
 *
 * Notes
 *
 * A monitorenter instruction may be used with one or more monitorexit instructions (§monitorexit) to implement a
 * synchronized statement in the Java programming language (§3.14). The monitorenter and monitorexit instructions are
 * not used in the implementation of synchronized methods, although they can be used to provide equivalent locking
 * semantics. Monitor entry on invocation of a synchronized method, and monitor exit on its return, are handled
 * implicitly by the Java Virtual Machine's method invocation and return instructions, as if monitorenter and
 * monitorexit were used.
 *
 * The association of a monitor with an object may be managed in various ways that are beyond the scope of this
 * specification. For instance, the monitor may be allocated and deallocated at the same time as the object.
 * Alternatively, it may be dynamically allocated at the time when a thread attempts to gain exclusive access to the
 * object and freed at some later time when no thread remains in the monitor for the object.
 *
 * The synchronization constructs of the Java programming language require support for operations on monitors besides
 * entry and exit. These include waiting on a monitor (Object.wait) and notifying other threads waiting on a monitor
 * (Object.notifyAll and Object.notify). These operations are supported in the standard package java.lang supplied with
 * the Java Virtual Machine. No explicit support for these operations appears in the instruction set of the Java Virtual
 * Machine.
 */